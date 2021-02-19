import Vue from 'vue'
import Router from 'vue-router'
import Login from './views/Login.vue'
import Home from './views/Home.vue'
import FriendChat from './views/chat/FriendChat.vue'
import HrInfo from './views/HrInfo.vue'

Vue.use(Router)

export default new Router({
    mode: 'history', //从默认的hash模式切换为history模式
    routes: [
        {
            path: '/',
            name: 'Default',
            redirect: '/home',
            component: Home
        }, {
            path: '/login',
            name: 'Login',
            component: Login,
        }, {
            path: '/home',
            name: 'Home',
            component: Home,
            hidden: true,
            meta: {
                roles: ['admin', 'user']
            },
            children: [
                {
                    path: '/chat',
                    name: '在线聊天',
                    component: FriendChat,
                }, {
                    path: '/hrinfo',
                    name: '个人中心',
                    component: HrInfo,
                }
            ]
        }, {
            path: '*',
            redirect: '/home'
        }
    ]
})
