(function(){"use strict";var n={485:function(n,t,e){var r=e(963),o=e(252),i=e.p+"img/logo.73b433a8.svg";const a={id:"app"},u={id:"nav"},l=(0,o._)("img",{src:i,style:{height:"50px",float:"left","margin-right":"20px"}},null,-1),c=(0,o.Uk)("Managed Identity Wallets Dashboard"),s=(0,o._)("div",{class:"clearfix"},null,-1);function f(n,t){const e=(0,o.up)("router-link"),r=(0,o.up)("router-view");return(0,o.wg)(),(0,o.iD)("div",a,[(0,o._)("div",u,[l,(0,o.Wm)(e,{to:"/"},{default:(0,o.w5)((()=>[c])),_:1}),s]),(0,o.Wm)(r)])}var d=e(744);const p={},v=(0,d.Z)(p,[["render",f]]);var m=v,g=e(119);const h={class:"home"};function b(n,t,e,r,i,a){const u=(0,o.up)("Wallets");return(0,o.wg)(),(0,o.iD)("div",h,[(0,o.Wm)(u)])}var w=e(577),y=e.p+"img/wallet.3676be81.svg",_=function(n){return(0,o.dD)("data-v-45596240"),n=n(),(0,o.Cn)(),n},k={class:"wallets"},O=_((function(){return(0,o._)("div",{class:"drawer"},[(0,o._)("div",{class:"selected"},"Administration")],-1)})),j={class:"list"},x=["onClick"],A=_((function(){return(0,o._)("img",{src:y,style:{"margin-right":"15px",width:"75px",float:"left"}},null,-1)})),C={style:{float:"left"}},D=_((function(){return(0,o._)("br",null,null,-1)})),T=_((function(){return(0,o._)("br",null,null,-1)})),S={class:"json"};function E(n,t,e,r,i,a){return(0,o.wg)(),(0,o.iD)("div",k,[O,(0,o._)("div",j,[(0,o._)("ul",null,[((0,o.wg)(!0),(0,o.iD)(o.HY,null,(0,o.Ko)(n.wallets,(function(t){return(0,o.wg)(),(0,o.iD)("li",{key:t.bpn,onClick:function(e){return n.loadDetails(t.bpn)}},[A,(0,o._)("div",C,[(0,o.Uk)((0,w.zw)(t.bpn),1),D,(0,o.Uk)((0,w.zw)(t.name),1),T,(0,o.Uk)((0,w.zw)(t.createdAt.replace("T"," ").substring(0,19)),1)])],8,x)})),128))]),(0,o._)("div",S,[(0,o._)("pre",null,(0,w.zw)(n.details),1)])])])}var N=(0,o.aZ)({data:function(){return{wallets:[],details:""}},mounted:function(){var n=this.wallets;fetch("/ui/wallets").then((function(n){return n.json()})).then((function(t){console.log(t),n.length=0;for(var e=0,r=t;e<r.length;e++){var o=r[e],i={bpn:o.bpn,name:o.name,createdAt:null!=o.wallet?o.wallet.createdAt:"",publicKey:null!=o.wallet?o.wallet.publicKey:""};n.push(i)}})).catch((function(n){console.log(n)}))},methods:{loadDetails:function(n){var t=this;fetch("/ui/wallets/"+n+"/full").then((function(n){return n.json()})).then((function(n){console.log(n),t.details="string"===typeof n?JSON.stringify(JSON.parse(n),void 0,2):JSON.stringify(n,void 0,2)})).catch((function(n){console.log(n)}))}}});const P=(0,d.Z)(N,[["render",E],["__scopeId","data-v-45596240"]]);var W=P,z={name:"Home",components:{Wallets:W}};const M=(0,d.Z)(z,[["render",b]]);var U=M,Z=[{path:"/",name:"Home",component:U},{path:"/about",name:"About",component:function(){return e.e(443).then(e.bind(e,721))}}],H=(0,g.p7)({history:(0,g.r5)("/ui/"),routes:Z}),J=H,K=e(907),F=(0,K.MT)({state:{},mutations:{},actions:{}}),I=F,L=(0,r.ri)(m);L.use(I),L.use(J),L.mount("#app")}},t={};function e(r){var o=t[r];if(void 0!==o)return o.exports;var i=t[r]={exports:{}};return n[r](i,i.exports,e),i.exports}e.m=n,function(){var n=[];e.O=function(t,r,o,i){if(!r){var a=1/0;for(s=0;s<n.length;s++){r=n[s][0],o=n[s][1],i=n[s][2];for(var u=!0,l=0;l<r.length;l++)(!1&i||a>=i)&&Object.keys(e.O).every((function(n){return e.O[n](r[l])}))?r.splice(l--,1):(u=!1,i<a&&(a=i));if(u){n.splice(s--,1);var c=o();void 0!==c&&(t=c)}}return t}i=i||0;for(var s=n.length;s>0&&n[s-1][2]>i;s--)n[s]=n[s-1];n[s]=[r,o,i]}}(),function(){e.d=function(n,t){for(var r in t)e.o(t,r)&&!e.o(n,r)&&Object.defineProperty(n,r,{enumerable:!0,get:t[r]})}}(),function(){e.f={},e.e=function(n){return Promise.all(Object.keys(e.f).reduce((function(t,r){return e.f[r](n,t),t}),[]))}}(),function(){e.u=function(n){return"js/about.53ad5c93.js"}}(),function(){e.miniCssF=function(n){}}(),function(){e.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(n){if("object"===typeof window)return window}}()}(),function(){e.o=function(n,t){return Object.prototype.hasOwnProperty.call(n,t)}}(),function(){var n={},t="managed-identity-wallets-admin:";e.l=function(r,o,i,a){if(n[r])n[r].push(o);else{var u,l;if(void 0!==i)for(var c=document.getElementsByTagName("script"),s=0;s<c.length;s++){var f=c[s];if(f.getAttribute("src")==r||f.getAttribute("data-webpack")==t+i){u=f;break}}u||(l=!0,u=document.createElement("script"),u.charset="utf-8",u.timeout=120,e.nc&&u.setAttribute("nonce",e.nc),u.setAttribute("data-webpack",t+i),u.src=r),n[r]=[o];var d=function(t,e){u.onerror=u.onload=null,clearTimeout(p);var o=n[r];if(delete n[r],u.parentNode&&u.parentNode.removeChild(u),o&&o.forEach((function(n){return n(e)})),t)return t(e)},p=setTimeout(d.bind(null,void 0,{type:"timeout",target:u}),12e4);u.onerror=d.bind(null,u.onerror),u.onload=d.bind(null,u.onload),l&&document.head.appendChild(u)}}}(),function(){e.r=function(n){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(n,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(n,"__esModule",{value:!0})}}(),function(){e.p="/ui/"}(),function(){var n={143:0};e.f.j=function(t,r){var o=e.o(n,t)?n[t]:void 0;if(0!==o)if(o)r.push(o[2]);else{var i=new Promise((function(e,r){o=n[t]=[e,r]}));r.push(o[2]=i);var a=e.p+e.u(t),u=new Error,l=function(r){if(e.o(n,t)&&(o=n[t],0!==o&&(n[t]=void 0),o)){var i=r&&("load"===r.type?"missing":r.type),a=r&&r.target&&r.target.src;u.message="Loading chunk "+t+" failed.\n("+i+": "+a+")",u.name="ChunkLoadError",u.type=i,u.request=a,o[1](u)}};e.l(a,l,"chunk-"+t,t)}},e.O.j=function(t){return 0===n[t]};var t=function(t,r){var o,i,a=r[0],u=r[1],l=r[2],c=0;if(a.some((function(t){return 0!==n[t]}))){for(o in u)e.o(u,o)&&(e.m[o]=u[o]);if(l)var s=l(e)}for(t&&t(r);c<a.length;c++)i=a[c],e.o(n,i)&&n[i]&&n[i][0](),n[i]=0;return e.O(s)},r=self["webpackChunkmanaged_identity_wallets_admin"]=self["webpackChunkmanaged_identity_wallets_admin"]||[];r.forEach(t.bind(null,0)),r.push=t.bind(null,r.push.bind(r))}();var r=e.O(void 0,[998],(function(){return e(485)}));r=e.O(r)})();
//# sourceMappingURL=app.5055cccd.js.map