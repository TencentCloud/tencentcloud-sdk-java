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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScaleUpRule extends AbstractModel {

    /**
    * 自动扩容策略开启，关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 集群用量占比，到达这个值后开始扩容,范围[10-90]
    */
    @SerializedName("ScaleThreshold")
    @Expose
    private Long ScaleThreshold;

    /**
    * 扩容后使用量跟集群总量比例,范围[1-90]
    */
    @SerializedName("TargetThreshold")
    @Expose
    private Long TargetThreshold;

    /**
     * Get 自动扩容策略开启，关闭 
     * @return Status 自动扩容策略开启，关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 自动扩容策略开启，关闭
     * @param Status 自动扩容策略开启，关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 集群用量占比，到达这个值后开始扩容,范围[10-90] 
     * @return ScaleThreshold 集群用量占比，到达这个值后开始扩容,范围[10-90]
     */
    public Long getScaleThreshold() {
        return this.ScaleThreshold;
    }

    /**
     * Set 集群用量占比，到达这个值后开始扩容,范围[10-90]
     * @param ScaleThreshold 集群用量占比，到达这个值后开始扩容,范围[10-90]
     */
    public void setScaleThreshold(Long ScaleThreshold) {
        this.ScaleThreshold = ScaleThreshold;
    }

    /**
     * Get 扩容后使用量跟集群总量比例,范围[1-90] 
     * @return TargetThreshold 扩容后使用量跟集群总量比例,范围[1-90]
     */
    public Long getTargetThreshold() {
        return this.TargetThreshold;
    }

    /**
     * Set 扩容后使用量跟集群总量比例,范围[1-90]
     * @param TargetThreshold 扩容后使用量跟集群总量比例,范围[1-90]
     */
    public void setTargetThreshold(Long TargetThreshold) {
        this.TargetThreshold = TargetThreshold;
    }

    public AutoScaleUpRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScaleUpRule(AutoScaleUpRule source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScaleThreshold != null) {
            this.ScaleThreshold = new Long(source.ScaleThreshold);
        }
        if (source.TargetThreshold != null) {
            this.TargetThreshold = new Long(source.TargetThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScaleThreshold", this.ScaleThreshold);
        this.setParamSimple(map, prefix + "TargetThreshold", this.TargetThreshold);

    }
}

