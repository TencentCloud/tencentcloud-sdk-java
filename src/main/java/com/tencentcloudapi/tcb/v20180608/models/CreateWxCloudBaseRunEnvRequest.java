/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWxCloudBaseRunEnvRequest extends AbstractModel{

    /**
    * wx应用Id
    */
    @SerializedName("WxAppId")
    @Expose
    private String WxAppId;

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
    * 是否打开云调用
    */
    @SerializedName("IsOpenCloudInvoke")
    @Expose
    private Boolean IsOpenCloudInvoke;

    /**
     * Get wx应用Id 
     * @return WxAppId wx应用Id
     */
    public String getWxAppId() {
        return this.WxAppId;
    }

    /**
     * Set wx应用Id
     * @param WxAppId wx应用Id
     */
    public void setWxAppId(String WxAppId) {
        this.WxAppId = WxAppId;
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
     * Get 是否打开云调用 
     * @return IsOpenCloudInvoke 是否打开云调用
     */
    public Boolean getIsOpenCloudInvoke() {
        return this.IsOpenCloudInvoke;
    }

    /**
     * Set 是否打开云调用
     * @param IsOpenCloudInvoke 是否打开云调用
     */
    public void setIsOpenCloudInvoke(Boolean IsOpenCloudInvoke) {
        this.IsOpenCloudInvoke = IsOpenCloudInvoke;
    }

    public CreateWxCloudBaseRunEnvRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWxCloudBaseRunEnvRequest(CreateWxCloudBaseRunEnvRequest source) {
        if (source.WxAppId != null) {
            this.WxAppId = new String(source.WxAppId);
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
        if (source.IsOpenCloudInvoke != null) {
            this.IsOpenCloudInvoke = new Boolean(source.IsOpenCloudInvoke);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WxAppId", this.WxAppId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubNetIds.", this.SubNetIds);
        this.setParamSimple(map, prefix + "IsOpenCloudInvoke", this.IsOpenCloudInvoke);

    }
}

