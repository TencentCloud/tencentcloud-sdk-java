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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenBackUpRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * OPEN 或者CLOSE
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 桶名字
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get OPEN 或者CLOSE 
     * @return OperationType OPEN 或者CLOSE
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set OPEN 或者CLOSE
     * @param OperationType OPEN 或者CLOSE
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 桶名字 
     * @return CosBucketName 桶名字
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set 桶名字
     * @param CosBucketName 桶名字
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    public OpenBackUpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBackUpRequest(OpenBackUpRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);

    }
}

