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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IsolateClusterRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 该参数已废用
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 实例退还原因类型
    */
    @SerializedName("IsolateReasonTypes")
    @Expose
    private Long [] IsolateReasonTypes;

    /**
    * 实例退还原因补充
    */
    @SerializedName("IsolateReason")
    @Expose
    private String IsolateReason;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 该参数已废用 
     * @return DbType 该参数已废用
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 该参数已废用
     * @param DbType 该参数已废用
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 实例退还原因类型 
     * @return IsolateReasonTypes 实例退还原因类型
     */
    public Long [] getIsolateReasonTypes() {
        return this.IsolateReasonTypes;
    }

    /**
     * Set 实例退还原因类型
     * @param IsolateReasonTypes 实例退还原因类型
     */
    public void setIsolateReasonTypes(Long [] IsolateReasonTypes) {
        this.IsolateReasonTypes = IsolateReasonTypes;
    }

    /**
     * Get 实例退还原因补充 
     * @return IsolateReason 实例退还原因补充
     */
    public String getIsolateReason() {
        return this.IsolateReason;
    }

    /**
     * Set 实例退还原因补充
     * @param IsolateReason 实例退还原因补充
     */
    public void setIsolateReason(String IsolateReason) {
        this.IsolateReason = IsolateReason;
    }

    public IsolateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IsolateClusterRequest(IsolateClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.IsolateReasonTypes != null) {
            this.IsolateReasonTypes = new Long[source.IsolateReasonTypes.length];
            for (int i = 0; i < source.IsolateReasonTypes.length; i++) {
                this.IsolateReasonTypes[i] = new Long(source.IsolateReasonTypes[i]);
            }
        }
        if (source.IsolateReason != null) {
            this.IsolateReason = new String(source.IsolateReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArraySimple(map, prefix + "IsolateReasonTypes.", this.IsolateReasonTypes);
        this.setParamSimple(map, prefix + "IsolateReason", this.IsolateReason);

    }
}

