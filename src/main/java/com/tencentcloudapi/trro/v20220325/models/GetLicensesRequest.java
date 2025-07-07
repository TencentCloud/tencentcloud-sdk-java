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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLicensesRequest extends AbstractModel {

    /**
    * 页码
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 页面数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * projectId
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * DeviceId
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * license状态：0:未绑定；1:已绑定；2:已停服；3:已退费
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 页码 
     * @return PageNum 页码
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页码
     * @param PageNum 页码
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 页面数量 
     * @return PageSize 页面数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页面数量
     * @param PageSize 页面数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get projectId 
     * @return ProjectId projectId
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set projectId
     * @param ProjectId projectId
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get DeviceId 
     * @return DeviceId DeviceId
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set DeviceId
     * @param DeviceId DeviceId
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get license状态：0:未绑定；1:已绑定；2:已停服；3:已退费 
     * @return Status license状态：0:未绑定；1:已绑定；2:已停服；3:已退费
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set license状态：0:未绑定；1:已绑定；2:已停服；3:已退费
     * @param Status license状态：0:未绑定；1:已绑定；2:已停服；3:已退费
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public GetLicensesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLicensesRequest(GetLicensesRequest source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

