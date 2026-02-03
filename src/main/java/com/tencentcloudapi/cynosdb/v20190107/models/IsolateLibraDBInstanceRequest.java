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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IsolateLibraDBInstanceRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 只读分析引擎实例 ID 列表
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * 是否是强制隔离
    */
    @SerializedName("ForceIsolate")
    @Expose
    private Boolean ForceIsolate;

    /**
    * 隔离原因类型
    */
    @SerializedName("IsolateReasonTypes")
    @Expose
    private Long [] IsolateReasonTypes;

    /**
    * 隔离原因
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
     * Get 只读分析引擎实例 ID 列表 
     * @return InstanceIdList 只读分析引擎实例 ID 列表
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set 只读分析引擎实例 ID 列表
     * @param InstanceIdList 只读分析引擎实例 ID 列表
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get 是否是强制隔离 
     * @return ForceIsolate 是否是强制隔离
     */
    public Boolean getForceIsolate() {
        return this.ForceIsolate;
    }

    /**
     * Set 是否是强制隔离
     * @param ForceIsolate 是否是强制隔离
     */
    public void setForceIsolate(Boolean ForceIsolate) {
        this.ForceIsolate = ForceIsolate;
    }

    /**
     * Get 隔离原因类型 
     * @return IsolateReasonTypes 隔离原因类型
     */
    public Long [] getIsolateReasonTypes() {
        return this.IsolateReasonTypes;
    }

    /**
     * Set 隔离原因类型
     * @param IsolateReasonTypes 隔离原因类型
     */
    public void setIsolateReasonTypes(Long [] IsolateReasonTypes) {
        this.IsolateReasonTypes = IsolateReasonTypes;
    }

    /**
     * Get 隔离原因 
     * @return IsolateReason 隔离原因
     */
    public String getIsolateReason() {
        return this.IsolateReason;
    }

    /**
     * Set 隔离原因
     * @param IsolateReason 隔离原因
     */
    public void setIsolateReason(String IsolateReason) {
        this.IsolateReason = IsolateReason;
    }

    public IsolateLibraDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IsolateLibraDBInstanceRequest(IsolateLibraDBInstanceRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.ForceIsolate != null) {
            this.ForceIsolate = new Boolean(source.ForceIsolate);
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
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "ForceIsolate", this.ForceIsolate);
        this.setParamArraySimple(map, prefix + "IsolateReasonTypes.", this.IsolateReasonTypes);
        this.setParamSimple(map, prefix + "IsolateReason", this.IsolateReason);

    }
}

