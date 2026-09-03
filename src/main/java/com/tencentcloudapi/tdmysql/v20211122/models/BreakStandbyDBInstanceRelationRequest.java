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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BreakStandbyDBInstanceRelationRequest extends AbstractModel {

    /**
    * 备实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否强制断开
    */
    @SerializedName("IsForce")
    @Expose
    private Boolean IsForce;

    /**
    *  时延，单位是秒,0不检查
    */
    @SerializedName("SyncDelay")
    @Expose
    private Long SyncDelay;

    /**
     * Get 备实例 ID 
     * @return InstanceId 备实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 备实例 ID
     * @param InstanceId 备实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否强制断开 
     * @return IsForce 是否强制断开
     */
    public Boolean getIsForce() {
        return this.IsForce;
    }

    /**
     * Set 是否强制断开
     * @param IsForce 是否强制断开
     */
    public void setIsForce(Boolean IsForce) {
        this.IsForce = IsForce;
    }

    /**
     * Get  时延，单位是秒,0不检查 
     * @return SyncDelay  时延，单位是秒,0不检查
     */
    public Long getSyncDelay() {
        return this.SyncDelay;
    }

    /**
     * Set  时延，单位是秒,0不检查
     * @param SyncDelay  时延，单位是秒,0不检查
     */
    public void setSyncDelay(Long SyncDelay) {
        this.SyncDelay = SyncDelay;
    }

    public BreakStandbyDBInstanceRelationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BreakStandbyDBInstanceRelationRequest(BreakStandbyDBInstanceRelationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IsForce != null) {
            this.IsForce = new Boolean(source.IsForce);
        }
        if (source.SyncDelay != null) {
            this.SyncDelay = new Long(source.SyncDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IsForce", this.IsForce);
        this.setParamSimple(map, prefix + "SyncDelay", this.SyncDelay);

    }
}

