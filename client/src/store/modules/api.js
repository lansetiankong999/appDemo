const baseUrl = process.env.VUE_APP_BASE_API
const api = {
  state: {
    // 注册中心
    nacosServer: 'http://47.107.177.14:8848/nacos',
    sentinelDashboard: 'http://47.107.177.14:8021',
    mossServer: 'http://47.107.177.14:8022',
    // swagger
    swaggerApi: baseUrl + '/swagger-ui.html'
  }
}

export default api
