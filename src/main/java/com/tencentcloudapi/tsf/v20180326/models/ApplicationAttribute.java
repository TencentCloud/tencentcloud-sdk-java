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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationAttribute extends AbstractModel {

    /**
    * <p>总实例个数</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>运行实例个数</p>
    */
    @SerializedName("RunInstanceCount")
    @Expose
    private Long RunInstanceCount;

    /**
    * <p>应用下部署组个数</p>
    */
    @SerializedName("GroupCount")
    @Expose
    private Long GroupCount;

    /**
    * <p>运行中部署组个数</p>
    */
    @SerializedName("RunningGroupCount")
    @Expose
    private String RunningGroupCount;

    /**
    * <p>异常部署组个数</p>
    */
    @SerializedName("AbnormalCount")
    @Expose
    private String AbnormalCount;

    /**
    * <p>镜像tag数量</p>
    */
    @SerializedName("ImageTagCount")
    @Expose
    private Long ImageTagCount;

    /**
     * Get <p>总实例个数</p> 
     * @return InstanceCount <p>总实例个数</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>总实例个数</p>
     * @param InstanceCount <p>总实例个数</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>运行实例个数</p> 
     * @return RunInstanceCount <p>运行实例个数</p>
     */
    public Long getRunInstanceCount() {
        return this.RunInstanceCount;
    }

    /**
     * Set <p>运行实例个数</p>
     * @param RunInstanceCount <p>运行实例个数</p>
     */
    public void setRunInstanceCount(Long RunInstanceCount) {
        this.RunInstanceCount = RunInstanceCount;
    }

    /**
     * Get <p>应用下部署组个数</p> 
     * @return GroupCount <p>应用下部署组个数</p>
     */
    public Long getGroupCount() {
        return this.GroupCount;
    }

    /**
     * Set <p>应用下部署组个数</p>
     * @param GroupCount <p>应用下部署组个数</p>
     */
    public void setGroupCount(Long GroupCount) {
        this.GroupCount = GroupCount;
    }

    /**
     * Get <p>运行中部署组个数</p> 
     * @return RunningGroupCount <p>运行中部署组个数</p>
     */
    public String getRunningGroupCount() {
        return this.RunningGroupCount;
    }

    /**
     * Set <p>运行中部署组个数</p>
     * @param RunningGroupCount <p>运行中部署组个数</p>
     */
    public void setRunningGroupCount(String RunningGroupCount) {
        this.RunningGroupCount = RunningGroupCount;
    }

    /**
     * Get <p>异常部署组个数</p> 
     * @return AbnormalCount <p>异常部署组个数</p>
     */
    public String getAbnormalCount() {
        return this.AbnormalCount;
    }

    /**
     * Set <p>异常部署组个数</p>
     * @param AbnormalCount <p>异常部署组个数</p>
     */
    public void setAbnormalCount(String AbnormalCount) {
        this.AbnormalCount = AbnormalCount;
    }

    /**
     * Get <p>镜像tag数量</p> 
     * @return ImageTagCount <p>镜像tag数量</p>
     */
    public Long getImageTagCount() {
        return this.ImageTagCount;
    }

    /**
     * Set <p>镜像tag数量</p>
     * @param ImageTagCount <p>镜像tag数量</p>
     */
    public void setImageTagCount(Long ImageTagCount) {
        this.ImageTagCount = ImageTagCount;
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
        if (source.ImageTagCount != null) {
            this.ImageTagCount = new Long(source.ImageTagCount);
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
        this.setParamSimple(map, prefix + "ImageTagCount", this.ImageTagCount);

    }
}

