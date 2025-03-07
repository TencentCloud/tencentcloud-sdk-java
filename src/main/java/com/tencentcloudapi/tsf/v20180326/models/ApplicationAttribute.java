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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationAttribute extends AbstractModel {

    /**
    * 总实例个数
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 运行实例个数
    */
    @SerializedName("RunInstanceCount")
    @Expose
    private Long RunInstanceCount;

    /**
    * 应用下部署组个数
    */
    @SerializedName("GroupCount")
    @Expose
    private Long GroupCount;

    /**
    * 运行中部署组个数
    */
    @SerializedName("RunningGroupCount")
    @Expose
    private String RunningGroupCount;

    /**
    * 异常部署组个数
    */
    @SerializedName("AbnormalCount")
    @Expose
    private String AbnormalCount;

    /**
     * Get 总实例个数 
     * @return InstanceCount 总实例个数
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 总实例个数
     * @param InstanceCount 总实例个数
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 运行实例个数 
     * @return RunInstanceCount 运行实例个数
     */
    public Long getRunInstanceCount() {
        return this.RunInstanceCount;
    }

    /**
     * Set 运行实例个数
     * @param RunInstanceCount 运行实例个数
     */
    public void setRunInstanceCount(Long RunInstanceCount) {
        this.RunInstanceCount = RunInstanceCount;
    }

    /**
     * Get 应用下部署组个数 
     * @return GroupCount 应用下部署组个数
     */
    public Long getGroupCount() {
        return this.GroupCount;
    }

    /**
     * Set 应用下部署组个数
     * @param GroupCount 应用下部署组个数
     */
    public void setGroupCount(Long GroupCount) {
        this.GroupCount = GroupCount;
    }

    /**
     * Get 运行中部署组个数 
     * @return RunningGroupCount 运行中部署组个数
     */
    public String getRunningGroupCount() {
        return this.RunningGroupCount;
    }

    /**
     * Set 运行中部署组个数
     * @param RunningGroupCount 运行中部署组个数
     */
    public void setRunningGroupCount(String RunningGroupCount) {
        this.RunningGroupCount = RunningGroupCount;
    }

    /**
     * Get 异常部署组个数 
     * @return AbnormalCount 异常部署组个数
     */
    public String getAbnormalCount() {
        return this.AbnormalCount;
    }

    /**
     * Set 异常部署组个数
     * @param AbnormalCount 异常部署组个数
     */
    public void setAbnormalCount(String AbnormalCount) {
        this.AbnormalCount = AbnormalCount;
    }

    public ApplicationAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationAttribute(ApplicationAttribute source) {
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.RunInstanceCount != null) {
            this.RunInstanceCount = new Long(source.RunInstanceCount);
        }
        if (source.GroupCount != null) {
            this.GroupCount = new Long(source.GroupCount);
        }
        if (source.RunningGroupCount != null) {
            this.RunningGroupCount = new String(source.RunningGroupCount);
        }
        if (source.AbnormalCount != null) {
            this.AbnormalCount = new String(source.AbnormalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "RunInstanceCount", this.RunInstanceCount);
        this.setParamSimple(map, prefix + "GroupCount", this.GroupCount);
        this.setParamSimple(map, prefix + "RunningGroupCount", this.RunningGroupCount);
        this.setParamSimple(map, prefix + "AbnormalCount", this.AbnormalCount);

    }
}

