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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateApplicationInfoRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("MpApplicationId")
    @Expose
    private String MpApplicationId;

    /**
    * 新建应用的应用名
    */
    @SerializedName("MpApplicationName")
    @Expose
    private String MpApplicationName;

    /**
    * 新建设备的备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
    */
    @SerializedName("AccessScope")
    @Expose
    private Long AccessScope;

    /**
     * Get 应用ID 
     * @return MpApplicationId 应用ID
     */
    public String getMpApplicationId() {
        return this.MpApplicationId;
    }

    /**
     * Set 应用ID
     * @param MpApplicationId 应用ID
     */
    public void setMpApplicationId(String MpApplicationId) {
        this.MpApplicationId = MpApplicationId;
    }

    /**
     * Get 新建应用的应用名 
     * @return MpApplicationName 新建应用的应用名
     */
    public String getMpApplicationName() {
        return this.MpApplicationName;
    }

    /**
     * Set 新建应用的应用名
     * @param MpApplicationName 新建应用的应用名
     */
    public void setMpApplicationName(String MpApplicationName) {
        this.MpApplicationName = MpApplicationName;
    }

    /**
     * Get 新建设备的备注 
     * @return Remark 新建设备的备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 新建设备的备注
     * @param Remark 新建设备的备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入） 
     * @return AccessScope 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     */
    public Long getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     * @param AccessScope 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     */
    public void setAccessScope(Long AccessScope) {
        this.AccessScope = AccessScope;
    }

    public UpdateApplicationInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateApplicationInfoRequest(UpdateApplicationInfoRequest source) {
        if (source.MpApplicationId != null) {
            this.MpApplicationId = new String(source.MpApplicationId);
        }
        if (source.MpApplicationName != null) {
            this.MpApplicationName = new String(source.MpApplicationName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new Long(source.AccessScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MpApplicationId", this.MpApplicationId);
        this.setParamSimple(map, prefix + "MpApplicationName", this.MpApplicationName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);

    }
}

