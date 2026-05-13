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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDspmBackupLogListResponse extends AbstractModel {

    /**
    * <p>总共多少条</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>备份日志列表</p>
    */
    @SerializedName("List")
    @Expose
    private BackupLog [] List;

    /**
    * <p>当前是否存在恢复中任务</p>
    */
    @SerializedName("HasRestoringTask")
    @Expose
    private Boolean HasRestoringTask;

    /**
    * <p>最大恢复空间</p>
    */
    @SerializedName("MaxRestoreSizeInGB")
    @Expose
    private Long MaxRestoreSizeInGB;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总共多少条</p> 
     * @return TotalCount <p>总共多少条</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总共多少条</p>
     * @param TotalCount <p>总共多少条</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>备份日志列表</p> 
     * @return List <p>备份日志列表</p>
     */
    public BackupLog [] getList() {
        return this.List;
    }

    /**
     * Set <p>备份日志列表</p>
     * @param List <p>备份日志列表</p>
     */
    public void setList(BackupLog [] List) {
        this.List = List;
    }

    /**
     * Get <p>当前是否存在恢复中任务</p> 
     * @return HasRestoringTask <p>当前是否存在恢复中任务</p>
     */
    public Boolean getHasRestoringTask() {
        return this.HasRestoringTask;
    }

    /**
     * Set <p>当前是否存在恢复中任务</p>
     * @param HasRestoringTask <p>当前是否存在恢复中任务</p>
     */
    public void setHasRestoringTask(Boolean HasRestoringTask) {
        this.HasRestoringTask = HasRestoringTask;
    }

    /**
     * Get <p>最大恢复空间</p> 
     * @return MaxRestoreSizeInGB <p>最大恢复空间</p>
     */
    public Long getMaxRestoreSizeInGB() {
        return this.MaxRestoreSizeInGB;
    }

    /**
     * Set <p>最大恢复空间</p>
     * @param MaxRestoreSizeInGB <p>最大恢复空间</p>
     */
    public void setMaxRestoreSizeInGB(Long MaxRestoreSizeInGB) {
        this.MaxRestoreSizeInGB = MaxRestoreSizeInGB;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDspmBackupLogListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmBackupLogListResponse(DescribeDspmBackupLogListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.List != null) {
            this.List = new BackupLog[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new BackupLog(source.List[i]);
            }
        }
        if (source.HasRestoringTask != null) {
            this.HasRestoringTask = new Boolean(source.HasRestoringTask);
        }
        if (source.MaxRestoreSizeInGB != null) {
            this.MaxRestoreSizeInGB = new Long(source.MaxRestoreSizeInGB);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "HasRestoringTask", this.HasRestoringTask);
        this.setParamSimple(map, prefix + "MaxRestoreSizeInGB", this.MaxRestoreSizeInGB);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

