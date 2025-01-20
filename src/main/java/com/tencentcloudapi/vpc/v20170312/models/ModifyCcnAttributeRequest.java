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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCcnAttributeRequest extends AbstractModel {

    /**
    * CCN实例ID。形如：ccn-f49l6u0z。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * CCN名称，最大长度不能超过60个字节，限制：CcnName和CcnDescription必须至少选择一个参数输入，否则报错。
    */
    @SerializedName("CcnName")
    @Expose
    private String CcnName;

    /**
    * CCN描述信息，最大长度不能超过100个字节，限制：CcnName和CcnDescription必须至少选择一个参数输入，否则报错。
    */
    @SerializedName("CcnDescription")
    @Expose
    private String CcnDescription;

    /**
    * 是否开启等价路由功能。`False` 不开启，`True` 开启。
    */
    @SerializedName("RouteECMPFlag")
    @Expose
    private Boolean RouteECMPFlag;

    /**
    * 是否开启路由重叠功能。`False` 不开启，`True` 开启。
    */
    @SerializedName("RouteOverlapFlag")
    @Expose
    private Boolean RouteOverlapFlag;

    /**
     * Get CCN实例ID。形如：ccn-f49l6u0z。 
     * @return CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set CCN实例ID。形如：ccn-f49l6u0z。
     * @param CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get CCN名称，最大长度不能超过60个字节，限制：CcnName和CcnDescription必须至少选择一个参数输入，否则报错。 
     * @return CcnName CCN名称，最大长度不能超过60个字节，限制：CcnName和CcnDescription必须至少选择一个参数输入，否则报错。
     */
    public String getCcnName() {
        return this.CcnName;
    }

    /**
     * Set CCN名称，最大长度不能超过60个字节，限制：CcnName和CcnDescription必须至少选择一个参数输入，否则报错。
     * @param CcnName CCN名称，最大长度不能超过60个字节，限制：CcnName和CcnDescription必须至少选择一个参数输入，否则报错。
     */
    public void setCcnName(String CcnName) {
        this.CcnName = CcnName;
    }

    /**
     * Get CCN描述信息，最大长度不能超过100个字节，限制：CcnName和CcnDescription必须至少选择一个参数输入，否则报错。 
     * @return CcnDescription CCN描述信息，最大长度不能超过100个字节，限制：CcnName和CcnDescription必须至少选择一个参数输入，否则报错。
     */
    public String getCcnDescription() {
        return this.CcnDescription;
    }

    /**
     * Set CCN描述信息，最大长度不能超过100个字节，限制：CcnName和CcnDescription必须至少选择一个参数输入，否则报错。
     * @param CcnDescription CCN描述信息，最大长度不能超过100个字节，限制：CcnName和CcnDescription必须至少选择一个参数输入，否则报错。
     */
    public void setCcnDescription(String CcnDescription) {
        this.CcnDescription = CcnDescription;
    }

    /**
     * Get 是否开启等价路由功能。`False` 不开启，`True` 开启。 
     * @return RouteECMPFlag 是否开启等价路由功能。`False` 不开启，`True` 开启。
     */
    public Boolean getRouteECMPFlag() {
        return this.RouteECMPFlag;
    }

    /**
     * Set 是否开启等价路由功能。`False` 不开启，`True` 开启。
     * @param RouteECMPFlag 是否开启等价路由功能。`False` 不开启，`True` 开启。
     */
    public void setRouteECMPFlag(Boolean RouteECMPFlag) {
        this.RouteECMPFlag = RouteECMPFlag;
    }

    /**
     * Get 是否开启路由重叠功能。`False` 不开启，`True` 开启。 
     * @return RouteOverlapFlag 是否开启路由重叠功能。`False` 不开启，`True` 开启。
     */
    public Boolean getRouteOverlapFlag() {
        return this.RouteOverlapFlag;
    }

    /**
     * Set 是否开启路由重叠功能。`False` 不开启，`True` 开启。
     * @param RouteOverlapFlag 是否开启路由重叠功能。`False` 不开启，`True` 开启。
     */
    public void setRouteOverlapFlag(Boolean RouteOverlapFlag) {
        this.RouteOverlapFlag = RouteOverlapFlag;
    }

    public ModifyCcnAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCcnAttributeRequest(ModifyCcnAttributeRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CcnName != null) {
            this.CcnName = new String(source.CcnName);
        }
        if (source.CcnDescription != null) {
            this.CcnDescription = new String(source.CcnDescription);
        }
        if (source.RouteECMPFlag != null) {
            this.RouteECMPFlag = new Boolean(source.RouteECMPFlag);
        }
        if (source.RouteOverlapFlag != null) {
            this.RouteOverlapFlag = new Boolean(source.RouteOverlapFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnName", this.CcnName);
        this.setParamSimple(map, prefix + "CcnDescription", this.CcnDescription);
        this.setParamSimple(map, prefix + "RouteECMPFlag", this.RouteECMPFlag);
        this.setParamSimple(map, prefix + "RouteOverlapFlag", this.RouteOverlapFlag);

    }
}

