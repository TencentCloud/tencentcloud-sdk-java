/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel {

    /**
    * <p>负载均衡LD的ID</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>负载均衡LD的名称</p>
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * <p>负载均衡监听器的ID</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>负载均衡监听器的名称</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>负载均衡实例的端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>负载均衡LD的地域<br>与 ApRegion 表达同一含义、格式不同。本字段为地域缩写；入参与 ApRegion 同时传入时以 ApRegion 为准</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>监听器协议，http、https</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>负载均衡监听器所在的zone</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>负载均衡实例所在地域，腾讯云标准地域格式<br>参数格式：形如 ap-guangzhou<br>与 Region 表达同一含义、格式不同。监听器恒为单地域，数组长度恒为 0 或 1<br>入参可选；与 Region 同时传入时以本字段为准；取值不在枚举范围内时返回 UnsupportedRegion<br>出参在可识别时填充，无法识别时为空数组<br>枚举值：<br>ap-guangzhou：广州<br>ap-shanghai：上海<br>ap-beijing：北京<br>ap-chengdu：成都<br>ap-chongqing：重庆<br>ap-hongkong：中国香港<br>ap-nanjing：南京<br>ap-tianjin：天津<br>ap-shenzhen：深圳<br>ap-qingyuan：清远<br>ap-guangzhou-open：广州Open<br>ap-shenzhen-fsi：深圳金融<br>ap-beijing-fsi：北京金融<br>ap-shanghai-fsi：上海金融<br>ap-hangzhou-ec：杭州<br>ap-fuzhou-ec：福州<br>ap-jinan-ec：济南<br>ap-wuhan-ec：武汉<br>ap-changsha-ec：长沙<br>ap-hefei-ec：合肥<br>ap-shenyang-ec：沈阳<br>ap-xian-ec：西安<br>ap-xibei-ec：西北<br>ap-shijiazhuang-ec：石家庄<br>ap-zhengzhou-ec：郑州<br>ap-qingyuan-xinan：清远信安<br>ap-shanghai-adc：上海ADC<br>ap-shanghai-wxp-ops：上海无线城市运营<br>ap-singapore：新加坡<br>ap-seoul：首尔<br>ap-tokyo：东京<br>ap-osaka：大阪<br>ap-mumbai：孟买<br>ap-bangkok：曼谷<br>ap-jakarta：雅加达<br>ap-taipei：台北<br>ap-johorbahru：柔佛巴鲁<br>eu-frankfurt：法兰克福<br>eu-moscow：莫斯科<br>na-ashburn：弗吉尼亚<br>na-siliconvalley：硅谷<br>na-toronto：多伦多<br>sa-saopaulo：圣保罗<br>me-saudi-arabia：沙特阿拉伯</p>
    */
    @SerializedName("ApRegion")
    @Expose
    private String [] ApRegion;

    /**
    * <p>负载均衡实例的IP。域名化CLB VIP可填空。</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>负载均衡的VPCID，公网为-1，内网按实际填写</p>
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * <p>负载均衡的网络类型。OPEN： 公网 INTERNAL ：内网</p>
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * <p>负载均衡的域名</p>
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
    * <p>监听器所属成员id</p>
    */
    @SerializedName("MemberAppId")
    @Expose
    private Long MemberAppId;

    /**
    * <p>监听器所属成员的uin</p>
    */
    @SerializedName("MemberUin")
    @Expose
    private String MemberUin;

    /**
     * Get <p>负载均衡LD的ID</p> 
     * @return LoadBalancerId <p>负载均衡LD的ID</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡LD的ID</p>
     * @param LoadBalancerId <p>负载均衡LD的ID</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>负载均衡LD的名称</p> 
     * @return LoadBalancerName <p>负载均衡LD的名称</p>
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set <p>负载均衡LD的名称</p>
     * @param LoadBalancerName <p>负载均衡LD的名称</p>
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get <p>负载均衡监听器的ID</p> 
     * @return ListenerId <p>负载均衡监听器的ID</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>负载均衡监听器的ID</p>
     * @param ListenerId <p>负载均衡监听器的ID</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>负载均衡监听器的名称</p> 
     * @return ListenerName <p>负载均衡监听器的名称</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>负载均衡监听器的名称</p>
     * @param ListenerName <p>负载均衡监听器的名称</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>负载均衡实例的端口</p> 
     * @return Vport <p>负载均衡实例的端口</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>负载均衡实例的端口</p>
     * @param Vport <p>负载均衡实例的端口</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>负载均衡LD的地域<br>与 ApRegion 表达同一含义、格式不同。本字段为地域缩写；入参与 ApRegion 同时传入时以 ApRegion 为准</p> 
     * @return Region <p>负载均衡LD的地域<br>与 ApRegion 表达同一含义、格式不同。本字段为地域缩写；入参与 ApRegion 同时传入时以 ApRegion 为准</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>负载均衡LD的地域<br>与 ApRegion 表达同一含义、格式不同。本字段为地域缩写；入参与 ApRegion 同时传入时以 ApRegion 为准</p>
     * @param Region <p>负载均衡LD的地域<br>与 ApRegion 表达同一含义、格式不同。本字段为地域缩写；入参与 ApRegion 同时传入时以 ApRegion 为准</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>监听器协议，http、https</p> 
     * @return Protocol <p>监听器协议，http、https</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>监听器协议，http、https</p>
     * @param Protocol <p>监听器协议，http、https</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>负载均衡监听器所在的zone</p> 
     * @return Zone <p>负载均衡监听器所在的zone</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>负载均衡监听器所在的zone</p>
     * @param Zone <p>负载均衡监听器所在的zone</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>负载均衡实例所在地域，腾讯云标准地域格式<br>参数格式：形如 ap-guangzhou<br>与 Region 表达同一含义、格式不同。监听器恒为单地域，数组长度恒为 0 或 1<br>入参可选；与 Region 同时传入时以本字段为准；取值不在枚举范围内时返回 UnsupportedRegion<br>出参在可识别时填充，无法识别时为空数组<br>枚举值：<br>ap-guangzhou：广州<br>ap-shanghai：上海<br>ap-beijing：北京<br>ap-chengdu：成都<br>ap-chongqing：重庆<br>ap-hongkong：中国香港<br>ap-nanjing：南京<br>ap-tianjin：天津<br>ap-shenzhen：深圳<br>ap-qingyuan：清远<br>ap-guangzhou-open：广州Open<br>ap-shenzhen-fsi：深圳金融<br>ap-beijing-fsi：北京金融<br>ap-shanghai-fsi：上海金融<br>ap-hangzhou-ec：杭州<br>ap-fuzhou-ec：福州<br>ap-jinan-ec：济南<br>ap-wuhan-ec：武汉<br>ap-changsha-ec：长沙<br>ap-hefei-ec：合肥<br>ap-shenyang-ec：沈阳<br>ap-xian-ec：西安<br>ap-xibei-ec：西北<br>ap-shijiazhuang-ec：石家庄<br>ap-zhengzhou-ec：郑州<br>ap-qingyuan-xinan：清远信安<br>ap-shanghai-adc：上海ADC<br>ap-shanghai-wxp-ops：上海无线城市运营<br>ap-singapore：新加坡<br>ap-seoul：首尔<br>ap-tokyo：东京<br>ap-osaka：大阪<br>ap-mumbai：孟买<br>ap-bangkok：曼谷<br>ap-jakarta：雅加达<br>ap-taipei：台北<br>ap-johorbahru：柔佛巴鲁<br>eu-frankfurt：法兰克福<br>eu-moscow：莫斯科<br>na-ashburn：弗吉尼亚<br>na-siliconvalley：硅谷<br>na-toronto：多伦多<br>sa-saopaulo：圣保罗<br>me-saudi-arabia：沙特阿拉伯</p> 
     * @return ApRegion <p>负载均衡实例所在地域，腾讯云标准地域格式<br>参数格式：形如 ap-guangzhou<br>与 Region 表达同一含义、格式不同。监听器恒为单地域，数组长度恒为 0 或 1<br>入参可选；与 Region 同时传入时以本字段为准；取值不在枚举范围内时返回 UnsupportedRegion<br>出参在可识别时填充，无法识别时为空数组<br>枚举值：<br>ap-guangzhou：广州<br>ap-shanghai：上海<br>ap-beijing：北京<br>ap-chengdu：成都<br>ap-chongqing：重庆<br>ap-hongkong：中国香港<br>ap-nanjing：南京<br>ap-tianjin：天津<br>ap-shenzhen：深圳<br>ap-qingyuan：清远<br>ap-guangzhou-open：广州Open<br>ap-shenzhen-fsi：深圳金融<br>ap-beijing-fsi：北京金融<br>ap-shanghai-fsi：上海金融<br>ap-hangzhou-ec：杭州<br>ap-fuzhou-ec：福州<br>ap-jinan-ec：济南<br>ap-wuhan-ec：武汉<br>ap-changsha-ec：长沙<br>ap-hefei-ec：合肥<br>ap-shenyang-ec：沈阳<br>ap-xian-ec：西安<br>ap-xibei-ec：西北<br>ap-shijiazhuang-ec：石家庄<br>ap-zhengzhou-ec：郑州<br>ap-qingyuan-xinan：清远信安<br>ap-shanghai-adc：上海ADC<br>ap-shanghai-wxp-ops：上海无线城市运营<br>ap-singapore：新加坡<br>ap-seoul：首尔<br>ap-tokyo：东京<br>ap-osaka：大阪<br>ap-mumbai：孟买<br>ap-bangkok：曼谷<br>ap-jakarta：雅加达<br>ap-taipei：台北<br>ap-johorbahru：柔佛巴鲁<br>eu-frankfurt：法兰克福<br>eu-moscow：莫斯科<br>na-ashburn：弗吉尼亚<br>na-siliconvalley：硅谷<br>na-toronto：多伦多<br>sa-saopaulo：圣保罗<br>me-saudi-arabia：沙特阿拉伯</p>
     */
    public String [] getApRegion() {
        return this.ApRegion;
    }

    /**
     * Set <p>负载均衡实例所在地域，腾讯云标准地域格式<br>参数格式：形如 ap-guangzhou<br>与 Region 表达同一含义、格式不同。监听器恒为单地域，数组长度恒为 0 或 1<br>入参可选；与 Region 同时传入时以本字段为准；取值不在枚举范围内时返回 UnsupportedRegion<br>出参在可识别时填充，无法识别时为空数组<br>枚举值：<br>ap-guangzhou：广州<br>ap-shanghai：上海<br>ap-beijing：北京<br>ap-chengdu：成都<br>ap-chongqing：重庆<br>ap-hongkong：中国香港<br>ap-nanjing：南京<br>ap-tianjin：天津<br>ap-shenzhen：深圳<br>ap-qingyuan：清远<br>ap-guangzhou-open：广州Open<br>ap-shenzhen-fsi：深圳金融<br>ap-beijing-fsi：北京金融<br>ap-shanghai-fsi：上海金融<br>ap-hangzhou-ec：杭州<br>ap-fuzhou-ec：福州<br>ap-jinan-ec：济南<br>ap-wuhan-ec：武汉<br>ap-changsha-ec：长沙<br>ap-hefei-ec：合肥<br>ap-shenyang-ec：沈阳<br>ap-xian-ec：西安<br>ap-xibei-ec：西北<br>ap-shijiazhuang-ec：石家庄<br>ap-zhengzhou-ec：郑州<br>ap-qingyuan-xinan：清远信安<br>ap-shanghai-adc：上海ADC<br>ap-shanghai-wxp-ops：上海无线城市运营<br>ap-singapore：新加坡<br>ap-seoul：首尔<br>ap-tokyo：东京<br>ap-osaka：大阪<br>ap-mumbai：孟买<br>ap-bangkok：曼谷<br>ap-jakarta：雅加达<br>ap-taipei：台北<br>ap-johorbahru：柔佛巴鲁<br>eu-frankfurt：法兰克福<br>eu-moscow：莫斯科<br>na-ashburn：弗吉尼亚<br>na-siliconvalley：硅谷<br>na-toronto：多伦多<br>sa-saopaulo：圣保罗<br>me-saudi-arabia：沙特阿拉伯</p>
     * @param ApRegion <p>负载均衡实例所在地域，腾讯云标准地域格式<br>参数格式：形如 ap-guangzhou<br>与 Region 表达同一含义、格式不同。监听器恒为单地域，数组长度恒为 0 或 1<br>入参可选；与 Region 同时传入时以本字段为准；取值不在枚举范围内时返回 UnsupportedRegion<br>出参在可识别时填充，无法识别时为空数组<br>枚举值：<br>ap-guangzhou：广州<br>ap-shanghai：上海<br>ap-beijing：北京<br>ap-chengdu：成都<br>ap-chongqing：重庆<br>ap-hongkong：中国香港<br>ap-nanjing：南京<br>ap-tianjin：天津<br>ap-shenzhen：深圳<br>ap-qingyuan：清远<br>ap-guangzhou-open：广州Open<br>ap-shenzhen-fsi：深圳金融<br>ap-beijing-fsi：北京金融<br>ap-shanghai-fsi：上海金融<br>ap-hangzhou-ec：杭州<br>ap-fuzhou-ec：福州<br>ap-jinan-ec：济南<br>ap-wuhan-ec：武汉<br>ap-changsha-ec：长沙<br>ap-hefei-ec：合肥<br>ap-shenyang-ec：沈阳<br>ap-xian-ec：西安<br>ap-xibei-ec：西北<br>ap-shijiazhuang-ec：石家庄<br>ap-zhengzhou-ec：郑州<br>ap-qingyuan-xinan：清远信安<br>ap-shanghai-adc：上海ADC<br>ap-shanghai-wxp-ops：上海无线城市运营<br>ap-singapore：新加坡<br>ap-seoul：首尔<br>ap-tokyo：东京<br>ap-osaka：大阪<br>ap-mumbai：孟买<br>ap-bangkok：曼谷<br>ap-jakarta：雅加达<br>ap-taipei：台北<br>ap-johorbahru：柔佛巴鲁<br>eu-frankfurt：法兰克福<br>eu-moscow：莫斯科<br>na-ashburn：弗吉尼亚<br>na-siliconvalley：硅谷<br>na-toronto：多伦多<br>sa-saopaulo：圣保罗<br>me-saudi-arabia：沙特阿拉伯</p>
     */
    public void setApRegion(String [] ApRegion) {
        this.ApRegion = ApRegion;
    }

    /**
     * Get <p>负载均衡实例的IP。域名化CLB VIP可填空。</p> 
     * @return Vip <p>负载均衡实例的IP。域名化CLB VIP可填空。</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>负载均衡实例的IP。域名化CLB VIP可填空。</p>
     * @param Vip <p>负载均衡实例的IP。域名化CLB VIP可填空。</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>负载均衡的VPCID，公网为-1，内网按实际填写</p> 
     * @return NumericalVpcId <p>负载均衡的VPCID，公网为-1，内网按实际填写</p>
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set <p>负载均衡的VPCID，公网为-1，内网按实际填写</p>
     * @param NumericalVpcId <p>负载均衡的VPCID，公网为-1，内网按实际填写</p>
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get <p>负载均衡的网络类型。OPEN： 公网 INTERNAL ：内网</p> 
     * @return LoadBalancerType <p>负载均衡的网络类型。OPEN： 公网 INTERNAL ：内网</p>
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set <p>负载均衡的网络类型。OPEN： 公网 INTERNAL ：内网</p>
     * @param LoadBalancerType <p>负载均衡的网络类型。OPEN： 公网 INTERNAL ：内网</p>
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get <p>负载均衡的域名</p> 
     * @return LoadBalancerDomain <p>负载均衡的域名</p>
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set <p>负载均衡的域名</p>
     * @param LoadBalancerDomain <p>负载均衡的域名</p>
     */
    public void setLoadBalancerDomain(String LoadBalancerDomain) {
        this.LoadBalancerDomain = LoadBalancerDomain;
    }

    /**
     * Get <p>监听器所属成员id</p> 
     * @return MemberAppId <p>监听器所属成员id</p>
     */
    public Long getMemberAppId() {
        return this.MemberAppId;
    }

    /**
     * Set <p>监听器所属成员id</p>
     * @param MemberAppId <p>监听器所属成员id</p>
     */
    public void setMemberAppId(Long MemberAppId) {
        this.MemberAppId = MemberAppId;
    }

    /**
     * Get <p>监听器所属成员的uin</p> 
     * @return MemberUin <p>监听器所属成员的uin</p>
     */
    public String getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set <p>监听器所属成员的uin</p>
     * @param MemberUin <p>监听器所属成员的uin</p>
     */
    public void setMemberUin(String MemberUin) {
        this.MemberUin = MemberUin;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ApRegion != null) {
            this.ApRegion = new String[source.ApRegion.length];
            for (int i = 0; i < source.ApRegion.length; i++) {
                this.ApRegion[i] = new String(source.ApRegion[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.LoadBalancerDomain != null) {
            this.LoadBalancerDomain = new String(source.LoadBalancerDomain);
        }
        if (source.MemberAppId != null) {
            this.MemberAppId = new Long(source.MemberAppId);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new String(source.MemberUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "ApRegion.", this.ApRegion);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "LoadBalancerDomain", this.LoadBalancerDomain);
        this.setParamSimple(map, prefix + "MemberAppId", this.MemberAppId);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);

    }
}

