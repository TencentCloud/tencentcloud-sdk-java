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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudRunEnvRequest extends AbstractModel {

    /**
    * <p>Trial,Standard,Professional,Enterprise</p>
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * <p>环境别名，要以a-z开头，不能包含 a-z,0-9,- 以外的字符</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。</p>
    */
    @SerializedName("FreeQuota")
    @Expose
    private String FreeQuota;

    /**
    * <p>订单标记。建议使用方统一转大小写之后再判断。QuickStart：快速启动来源Activity：活动来源</p>
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
    * <p>私有网络Id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网列表</p>
    */
    @SerializedName("SubNetIds")
    @Expose
    private String [] SubNetIds;

    /**
    * <p>请求key 用于防重</p>
    */
    @SerializedName("ReqKey")
    @Expose
    private String ReqKey;

    /**
    * <p>来源：wechat | cloud | weda</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>渠道：wechat | cloud | weda</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>环境ID 云开发平台必填</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
     * Get <p>Trial,Standard,Professional,Enterprise</p> 
     * @return PackageType <p>Trial,Standard,Professional,Enterprise</p>
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>Trial,Standard,Professional,Enterprise</p>
     * @param PackageType <p>Trial,Standard,Professional,Enterprise</p>
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>环境别名，要以a-z开头，不能包含 a-z,0-9,- 以外的字符</p> 
     * @return Alias <p>环境别名，要以a-z开头，不能包含 a-z,0-9,- 以外的字符</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>环境别名，要以a-z开头，不能包含 a-z,0-9,- 以外的字符</p>
     * @param Alias <p>环境别名，要以a-z开头，不能包含 a-z,0-9,- 以外的字符</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。</p> 
     * @return FreeQuota <p>用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。</p>
     */
    public String getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set <p>用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。</p>
     * @param FreeQuota <p>用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。</p>
     */
    public void setFreeQuota(String FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get <p>订单标记。建议使用方统一转大小写之后再判断。QuickStart：快速启动来源Activity：活动来源</p> 
     * @return Flag <p>订单标记。建议使用方统一转大小写之后再判断。QuickStart：快速启动来源Activity：活动来源</p>
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set <p>订单标记。建议使用方统一转大小写之后再判断。QuickStart：快速启动来源Activity：活动来源</p>
     * @param Flag <p>订单标记。建议使用方统一转大小写之后再判断。QuickStart：快速启动来源Activity：活动来源</p>
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    /**
     * Get <p>私有网络Id</p> 
     * @return VpcId <p>私有网络Id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络Id</p>
     * @param VpcId <p>私有网络Id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网列表</p> 
     * @return SubNetIds <p>子网列表</p>
     */
    public String [] getSubNetIds() {
        return this.SubNetIds;
    }

    /**
     * Set <p>子网列表</p>
     * @param SubNetIds <p>子网列表</p>
     */
    public void setSubNetIds(String [] SubNetIds) {
        this.SubNetIds = SubNetIds;
    }

    /**
     * Get <p>请求key 用于防重</p> 
     * @return ReqKey <p>请求key 用于防重</p>
     */
    public String getReqKey() {
        return this.ReqKey;
    }

    /**
     * Set <p>请求key 用于防重</p>
     * @param ReqKey <p>请求key 用于防重</p>
     */
    public void setReqKey(String ReqKey) {
        this.ReqKey = ReqKey;
    }

    /**
     * Get <p>来源：wechat | cloud | weda</p> 
     * @return Source <p>来源：wechat | cloud | weda</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>来源：wechat | cloud | weda</p>
     * @param Source <p>来源：wechat | cloud | weda</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>渠道：wechat | cloud | weda</p> 
     * @return Channel <p>渠道：wechat | cloud | weda</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>渠道：wechat | cloud | weda</p>
     * @param Channel <p>渠道：wechat | cloud | weda</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>环境ID 云开发平台必填</p> 
     * @return EnvId <p>环境ID 云开发平台必填</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID 云开发平台必填</p>
     * @param EnvId <p>环境ID 云开发平台必填</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    public CreateCloudRunEnvRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudRunEnvRequest(CreateCloudRunEnvRequest source) {
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.FreeQuota != null) {
            this.FreeQuota = new String(source.FreeQuota);
        }
        if (source.Flag != null) {
            this.Flag = new String(source.Flag);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubNetIds != null) {
            this.SubNetIds = new String[source.SubNetIds.length];
            for (int i = 0; i < source.SubNetIds.length; i++) {
                this.SubNetIds[i] = new String(source.SubNetIds[i]);
            }
        }
        if (source.ReqKey != null) {
            this.ReqKey = new String(source.ReqKey);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubNetIds.", this.SubNetIds);
        this.setParamSimple(map, prefix + "ReqKey", this.ReqKey);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);

    }
}

