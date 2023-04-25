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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFileSystemAutoScaleUpRuleResponse extends AbstractModel{

    /**
    * 文件系统id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 规则状态0:关闭，1 开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 扩容阈值,范围[10-90]
    */
    @SerializedName("ScaleUpThreshold")
    @Expose
    private Long ScaleUpThreshold;

    /**
    * 扩容后达到阈值,范围[10-90]
    */
    @SerializedName("TargetThreshold")
    @Expose
    private Long TargetThreshold;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文件系统id 
     * @return FileSystemId 文件系统id
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统id
     * @param FileSystemId 文件系统id
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 规则状态0:关闭，1 开启 
     * @return Status 规则状态0:关闭，1 开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态0:关闭，1 开启
     * @param Status 规则状态0:关闭，1 开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 扩容阈值,范围[10-90] 
     * @return ScaleUpThreshold 扩容阈值,范围[10-90]
     */
    public Long getScaleUpThreshold() {
        return this.ScaleUpThreshold;
    }

    /**
     * Set 扩容阈值,范围[10-90]
     * @param ScaleUpThreshold 扩容阈值,范围[10-90]
     */
    public void setScaleUpThreshold(Long ScaleUpThreshold) {
        this.ScaleUpThreshold = ScaleUpThreshold;
    }

    /**
     * Get 扩容后达到阈值,范围[10-90] 
     * @return TargetThreshold 扩容后达到阈值,范围[10-90]
     */
    public Long getTargetThreshold() {
        return this.TargetThreshold;
    }

    /**
     * Set 扩容后达到阈值,范围[10-90]
     * @param TargetThreshold 扩容后达到阈值,范围[10-90]
     */
    public void setTargetThreshold(Long TargetThreshold) {
        this.TargetThreshold = TargetThreshold;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyFileSystemAutoScaleUpRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileSystemAutoScaleUpRuleResponse(ModifyFileSystemAutoScaleUpRuleResponse source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ScaleUpThreshold != null) {
            this.ScaleUpThreshold = new Long(source.ScaleUpThreshold);
        }
        if (source.TargetThreshold != null) {
            this.TargetThreshold = new Long(source.TargetThreshold);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScaleUpThreshold", this.ScaleUpThreshold);
        this.setParamSimple(map, prefix + "TargetThreshold", this.TargetThreshold);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

