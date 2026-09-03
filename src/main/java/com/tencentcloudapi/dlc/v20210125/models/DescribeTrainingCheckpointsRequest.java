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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrainingCheckpointsRequest extends AbstractModel {

    /**
    * <p>训练作业实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>当前浏览的子路径</p>
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
     * Get <p>训练作业实例ID</p> 
     * @return InstanceId <p>训练作业实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>训练作业实例ID</p>
     * @param InstanceId <p>训练作业实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>当前浏览的子路径</p> 
     * @return SubPath <p>当前浏览的子路径</p>
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set <p>当前浏览的子路径</p>
     * @param SubPath <p>当前浏览的子路径</p>
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    public DescribeTrainingCheckpointsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrainingCheckpointsRequest(DescribeTrainingCheckpointsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);

    }
}

