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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFileSystemAutoScaleUpRuleRequest extends AbstractModel {

    /**
    * 文件系统 ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 扩容阈值，范围[10-90]
    */
    @SerializedName("ScaleUpThreshold")
    @Expose
    private Long ScaleUpThreshold;

    /**
    * 扩容后目标阈值，范围[10-90]，该值要小于 ScaleUpThreshold
    */
    @SerializedName("TargetThreshold")
    @Expose
    private Long TargetThreshold;

    /**
    * 规则状态 0：关闭，1：开启；不传保留原状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 文件系统 ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 
     * @return FileSystemId 文件系统 ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统 ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
     * @param FileSystemId 文件系统 ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 扩容阈值，范围[10-90] 
     * @return ScaleUpThreshold 扩容阈值，范围[10-90]
     */
    public Long getScaleUpThreshold() {
        return this.ScaleUpThreshold;
    }

    /**
     * Set 扩容阈值，范围[10-90]
     * @param ScaleUpThreshold 扩容阈值，范围[10-90]
     */
    public void setScaleUpThreshold(Long ScaleUpThreshold) {
        this.ScaleUpThreshold = ScaleUpThreshold;
    }

    /**
     * Get 扩容后目标阈值，范围[10-90]，该值要小于 ScaleUpThreshold 
     * @return TargetThreshold 扩容后目标阈值，范围[10-90]，该值要小于 ScaleUpThreshold
     */
    public Long getTargetThreshold() {
        return this.TargetThreshold;
    }

    /**
     * Set 扩容后目标阈值，范围[10-90]，该值要小于 ScaleUpThreshold
     * @param TargetThreshold 扩容后目标阈值，范围[10-90]，该值要小于 ScaleUpThreshold
     */
    public void setTargetThreshold(Long TargetThreshold) {
        this.TargetThreshold = TargetThreshold;
    }

    /**
     * Get 规则状态 0：关闭，1：开启；不传保留原状态 
     * @return Status 规则状态 0：关闭，1：开启；不传保留原状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态 0：关闭，1：开启；不传保留原状态
     * @param Status 规则状态 0：关闭，1：开启；不传保留原状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyFileSystemAutoScaleUpRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileSystemAutoScaleUpRuleRequest(ModifyFileSystemAutoScaleUpRuleRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.ScaleUpThreshold != null) {
            this.ScaleUpThreshold = new Long(source.ScaleUpThreshold);
        }
        if (source.TargetThreshold != null) {
            this.TargetThreshold = new Long(source.TargetThreshold);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "ScaleUpThreshold", this.ScaleUpThreshold);
        this.setParamSimple(map, prefix + "TargetThreshold", this.TargetThreshold);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

