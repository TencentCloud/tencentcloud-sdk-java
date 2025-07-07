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
    * Trial,Standard,Professional,Enterprise
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 环境别名，要以a-z开头，不能包含 a-z,0-9,- 以外的字符
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
    */
    @SerializedName("FreeQuota")
    @Expose
    private String FreeQuota;

    /**
    * 订单标记。建议使用方统一转大小写之后再判断。
QuickStart：快速启动来源
Activity：活动来源
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
    * 私有网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网列表
    */
    @SerializedName("SubNetIds")
    @Expose
    private String [] SubNetIds;

    /**
    * 请求key 用于防重
    */
    @SerializedName("ReqKey")
    @Expose
    private String ReqKey;

    /**
    * 来源：wechat | cloud | weda
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 渠道：wechat | cloud | weda
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 环境ID 云开发平台必填
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
     * Get Trial,Standard,Professional,Enterprise 
     * @return PackageType Trial,Standard,Professional,Enterprise
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Trial,Standard,Professional,Enterprise
     * @param PackageType Trial,Standard,Professional,Enterprise
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 环境别名，要以a-z开头，不能包含 a-z,0-9,- 以外的字符 
     * @return Alias 环境别名，要以a-z开头，不能包含 a-z,0-9,- 以外的字符
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 环境别名，要以a-z开头，不能包含 a-z,0-9,- 以外的字符
     * @param Alias 环境别名，要以a-z开头，不能包含 a-z,0-9,- 以外的字符
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。 
     * @return FreeQuota 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
     */
    public String getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
     * @param FreeQuota 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
     */
    public void setFreeQuota(String FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get 订单标记。建议使用方统一转大小写之后再判断。
QuickStart：快速启动来源
Activity：活动来源 
     * @return Flag 订单标记。建议使用方统一转大小写之后再判断。
QuickStart：快速启动来源
Activity：活动来源
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set 订单标记。建议使用方统一转大小写之后再判断。
QuickStart：快速启动来源
Activity：活动来源
     * @param Flag 订单标记。建议使用方统一转大小写之后再判断。
QuickStart：快速启动来源
Activity：活动来源
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 私有网络Id 
     * @return VpcId 私有网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络Id
     * @param VpcId 私有网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网列表 
     * @return SubNetIds 子网列表
     */
    public String [] getSubNetIds() {
        return this.SubNetIds;
    }

    /**
     * Set 子网列表
     * @param SubNetIds 子网列表
     */
    public void setSubNetIds(String [] SubNetIds) {
        this.SubNetIds = SubNetIds;
    }

    /**
     * Get 请求key 用于防重 
     * @return ReqKey 请求key 用于防重
     */
    public String getReqKey() {
        return this.ReqKey;
    }

    /**
     * Set 请求key 用于防重
     * @param ReqKey 请求key 用于防重
     */
    public void setReqKey(String ReqKey) {
        this.ReqKey = ReqKey;
    }

    /**
     * Get 来源：wechat | cloud | weda 
     * @return Source 来源：wechat | cloud | weda
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源：wechat | cloud | weda
     * @param Source 来源：wechat | cloud | weda
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 渠道：wechat | cloud | weda 
     * @return Channel 渠道：wechat | cloud | weda
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道：wechat | cloud | weda
     * @param Channel 渠道：wechat | cloud | weda
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 环境ID 云开发平台必填 
     * @return EnvId 环境ID 云开发平台必填
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID 云开发平台必填
     * @param EnvId 环境ID 云开发平台必填
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

