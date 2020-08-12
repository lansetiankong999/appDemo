package com.alibaba.cloud.sentinel.feign;

import feign.Contract;
import feign.MethodMetadata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * cnm 2.2.0使用的 Contract delegate类的 parseAndValidatateMetadata 在 springcloud Hoxton.SR1 版本后被修正
 *
 * @author Jump
 * @date 2020/8/5 16:25
 */
public class SentinelContractHolder implements Contract {

    private final Contract delegate;

    /**
     * map key is constructed by ClassFullName + configKey. configKey is constructed by
     * {@link feign.Feign#configKey}
     */
    public final static Map<String, MethodMetadata> METADATA_MAP = new HashMap<>();

    public SentinelContractHolder(Contract delegate) {
        this.delegate = delegate;
    }

    @Override
    public List<MethodMetadata> parseAndValidateMetadata(Class<?> targetType) {
        List<MethodMetadata> metadatas = delegate.parseAndValidateMetadata(targetType);
        metadatas.forEach(metadata -> METADATA_MAP
                .put(targetType.getName() + metadata.configKey(), metadata));
        return metadatas;
    }
}
