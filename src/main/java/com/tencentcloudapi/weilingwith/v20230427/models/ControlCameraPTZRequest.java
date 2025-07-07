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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlCameraPTZRequest extends AbstractModel {

    /**
    * 设备的唯一标识
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * ptz指令
left - 向左移动
right - 向右移动
up - 向上移动
down - 向下
zoomOut - 镜头缩小
zoomIn - 镜头放大
irisIn - 光圈缩小
irisOut - 光圈放大
focusIn - 焦距变近
focusOut - 焦距变远

    */
    @SerializedName("CMD")
    @Expose
    private String CMD;

    /**
    * 工作空间Id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
     * Get 设备的唯一标识 
     * @return WID 设备的唯一标识
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备的唯一标识
     * @param WID 设备的唯一标识
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get ptz指令
left - 向左移动
right - 向右移动
up - 向上移动
down - 向下
zoomOut - 镜头缩小
zoomIn - 镜头放大
irisIn - 光圈缩小
irisOut - 光圈放大
focusIn - 焦距变近
focusOut - 焦距变远
 
     * @return CMD ptz指令
left - 向左移动
right - 向右移动
up - 向上移动
down - 向下
zoomOut - 镜头缩小
zoomIn - 镜头放大
irisIn - 光圈缩小
irisOut - 光圈放大
focusIn - 焦距变近
focusOut - 焦距变远

     */
    public String getCMD() {
        return this.CMD;
    }

    /**
     * Set ptz指令
left - 向左移动
right - 向右移动
up - 向上移动
down - 向下
zoomOut - 镜头缩小
zoomIn - 镜头放大
irisIn - 光圈缩小
irisOut - 光圈放大
focusIn - 焦距变近
focusOut - 焦距变远

     * @param CMD ptz指令
left - 向左移动
right - 向右移动
up - 向上移动
down - 向下
zoomOut - 镜头缩小
zoomIn - 镜头放大
irisIn - 光圈缩小
irisOut - 光圈放大
focusIn - 焦距变近
focusOut - 焦距变远

     */
    public void setCMD(String CMD) {
        this.CMD = CMD;
    }

    /**
     * Get 工作空间Id 
     * @return WorkspaceId 工作空间Id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间Id
     * @param WorkspaceId 工作空间Id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    public ControlCameraPTZRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlCameraPTZRequest(ControlCameraPTZRequest source) {
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.CMD != null) {
            this.CMD = new String(source.CMD);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamSimple(map, prefix + "CMD", this.CMD);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);

    }
}

