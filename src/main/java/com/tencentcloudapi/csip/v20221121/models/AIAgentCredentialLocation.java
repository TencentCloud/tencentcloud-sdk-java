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

public class AIAgentCredentialLocation extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>容器 ID</p>
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * <p>凭据所在路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>凭据所在行号</p>
    */
    @SerializedName("Line")
    @Expose
    private Long Line;

    /**
    * <p>凭据脱敏片段</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>凭据是否托管</p><p>枚举值：</p><ul><li>1： 托管</li><li>0： 未托管</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>凭据托管 ID</p>
    */
    @SerializedName("DelegateID")
    @Expose
    private Long DelegateID;

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceID <p>实例 ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceID <p>实例 ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>容器 ID</p> 
     * @return ContainerID <p>容器 ID</p>
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set <p>容器 ID</p>
     * @param ContainerID <p>容器 ID</p>
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    /**
     * Get <p>凭据所在路径</p> 
     * @return Path <p>凭据所在路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>凭据所在路径</p>
     * @param Path <p>凭据所在路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>凭据所在行号</p> 
     * @return Line <p>凭据所在行号</p>
     */
    public Long getLine() {
        return this.Line;
    }

    /**
     * Set <p>凭据所在行号</p>
     * @param Line <p>凭据所在行号</p>
     */
    public void setLine(Long Line) {
        this.Line = Line;
    }

    /**
     * Get <p>凭据脱敏片段</p> 
     * @return Content <p>凭据脱敏片段</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>凭据脱敏片段</p>
     * @param Content <p>凭据脱敏片段</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>凭据是否托管</p><p>枚举值：</p><ul><li>1： 托管</li><li>0： 未托管</li></ul> 
     * @return Status <p>凭据是否托管</p><p>枚举值：</p><ul><li>1： 托管</li><li>0： 未托管</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>凭据是否托管</p><p>枚举值：</p><ul><li>1： 托管</li><li>0： 未托管</li></ul>
     * @param Status <p>凭据是否托管</p><p>枚举值：</p><ul><li>1： 托管</li><li>0： 未托管</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>凭据托管 ID</p> 
     * @return DelegateID <p>凭据托管 ID</p>
     */
    public Long getDelegateID() {
        return this.DelegateID;
    }

    /**
     * Set <p>凭据托管 ID</p>
     * @param DelegateID <p>凭据托管 ID</p>
     */
    public void setDelegateID(Long DelegateID) {
        this.DelegateID = DelegateID;
    }

    public AIAgentCredentialLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAgentCredentialLocation(AIAgentCredentialLocation source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Line != null) {
            this.Line = new Long(source.Line);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DelegateID != null) {
            this.DelegateID = new Long(source.DelegateID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DelegateID", this.DelegateID);

    }
}

