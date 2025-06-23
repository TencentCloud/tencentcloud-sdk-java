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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudNativeAPIGatewayRequest extends AbstractModel {

    /**
    * 云原生API网关实例ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 云原生API网关名字, 最多支持60个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 云原生API网关描述信息, 最多支持120个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否开启 CLS 日志。暂时取值只能是 true，即只能从关闭状态变成开启状态。
    */
    @SerializedName("EnableCls")
    @Expose
    private Boolean EnableCls;

    /**
    * 公网计费模式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。
    */
    @SerializedName("InternetPayMode")
    @Expose
    private String InternetPayMode;

    /**
    * 是否开启实例删除保护,默认false
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
     * Get 云原生API网关实例ID。 
     * @return GatewayId 云原生API网关实例ID。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 云原生API网关实例ID。
     * @param GatewayId 云原生API网关实例ID。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 云原生API网关名字, 最多支持60个字符。 
     * @return Name 云原生API网关名字, 最多支持60个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 云原生API网关名字, 最多支持60个字符。
     * @param Name 云原生API网关名字, 最多支持60个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 云原生API网关描述信息, 最多支持120个字符。 
     * @return Description 云原生API网关描述信息, 最多支持120个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 云原生API网关描述信息, 最多支持120个字符。
     * @param Description 云原生API网关描述信息, 最多支持120个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否开启 CLS 日志。暂时取值只能是 true，即只能从关闭状态变成开启状态。 
     * @return EnableCls 是否开启 CLS 日志。暂时取值只能是 true，即只能从关闭状态变成开启状态。
     */
    public Boolean getEnableCls() {
        return this.EnableCls;
    }

    /**
     * Set 是否开启 CLS 日志。暂时取值只能是 true，即只能从关闭状态变成开启状态。
     * @param EnableCls 是否开启 CLS 日志。暂时取值只能是 true，即只能从关闭状态变成开启状态。
     */
    public void setEnableCls(Boolean EnableCls) {
        this.EnableCls = EnableCls;
    }

    /**
     * Get 公网计费模式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。 
     * @return InternetPayMode 公网计费模式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。
     */
    public String getInternetPayMode() {
        return this.InternetPayMode;
    }

    /**
     * Set 公网计费模式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。
     * @param InternetPayMode 公网计费模式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。
     */
    public void setInternetPayMode(String InternetPayMode) {
        this.InternetPayMode = InternetPayMode;
    }

    /**
     * Get 是否开启实例删除保护,默认false 
     * @return DeleteProtect 是否开启实例删除保护,默认false
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set 是否开启实例删除保护,默认false
     * @param DeleteProtect 是否开启实例删除保护,默认false
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    public ModifyCloudNativeAPIGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayRequest(ModifyCloudNativeAPIGatewayRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnableCls != null) {
            this.EnableCls = new Boolean(source.EnableCls);
        }
        if (source.InternetPayMode != null) {
            this.InternetPayMode = new String(source.InternetPayMode);
        }
        if (source.DeleteProtect != null) {
            this.DeleteProtect = new Boolean(source.DeleteProtect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnableCls", this.EnableCls);
        this.setParamSimple(map, prefix + "InternetPayMode", this.InternetPayMode);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);

    }
}

