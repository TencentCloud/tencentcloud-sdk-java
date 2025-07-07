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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpsTaskLinkInfoDto extends AbstractModel {

    /**
    * 下游任务id
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

    /**
    * 上游任务id
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * 依赖边类型 1、“real_real”表示任务->任务；2、"virtual_real" 跨工作流任务->任务
    */
    @SerializedName("LinkType")
    @Expose
    private String LinkType;

    /**
    * 依赖边id
    */
    @SerializedName("LinkId")
    @Expose
    private String LinkId;

    /**
    * 为了区分新增的循环依赖新增的类型。默认是normal，循环依赖则是circulate
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkStyle")
    @Expose
    private String LinkStyle;

    /**
     * Get 下游任务id 
     * @return TaskTo 下游任务id
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set 下游任务id
     * @param TaskTo 下游任务id
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
    }

    /**
     * Get 上游任务id 
     * @return TaskFrom 上游任务id
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set 上游任务id
     * @param TaskFrom 上游任务id
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get 依赖边类型 1、“real_real”表示任务->任务；2、"virtual_real" 跨工作流任务->任务 
     * @return LinkType 依赖边类型 1、“real_real”表示任务->任务；2、"virtual_real" 跨工作流任务->任务
     */
    public String getLinkType() {
        return this.LinkType;
    }

    /**
     * Set 依赖边类型 1、“real_real”表示任务->任务；2、"virtual_real" 跨工作流任务->任务
     * @param LinkType 依赖边类型 1、“real_real”表示任务->任务；2、"virtual_real" 跨工作流任务->任务
     */
    public void setLinkType(String LinkType) {
        this.LinkType = LinkType;
    }

    /**
     * Get 依赖边id 
     * @return LinkId 依赖边id
     */
    public String getLinkId() {
        return this.LinkId;
    }

    /**
     * Set 依赖边id
     * @param LinkId 依赖边id
     */
    public void setLinkId(String LinkId) {
        this.LinkId = LinkId;
    }

    /**
     * Get 为了区分新增的循环依赖新增的类型。默认是normal，循环依赖则是circulate
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkStyle 为了区分新增的循环依赖新增的类型。默认是normal，循环依赖则是circulate
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkStyle() {
        return this.LinkStyle;
    }

    /**
     * Set 为了区分新增的循环依赖新增的类型。默认是normal，循环依赖则是circulate
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkStyle 为了区分新增的循环依赖新增的类型。默认是normal，循环依赖则是circulate
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkStyle(String LinkStyle) {
        this.LinkStyle = LinkStyle;
    }

    public OpsTaskLinkInfoDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsTaskLinkInfoDto(OpsTaskLinkInfoDto source) {
        if (source.TaskTo != null) {
            this.TaskTo = new String(source.TaskTo);
        }
        if (source.TaskFrom != null) {
            this.TaskFrom = new String(source.TaskFrom);
        }
        if (source.LinkType != null) {
            this.LinkType = new String(source.LinkType);
        }
        if (source.LinkId != null) {
            this.LinkId = new String(source.LinkId);
        }
        if (source.LinkStyle != null) {
            this.LinkStyle = new String(source.LinkStyle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "LinkType", this.LinkType);
        this.setParamSimple(map, prefix + "LinkId", this.LinkId);
        this.setParamSimple(map, prefix + "LinkStyle", this.LinkStyle);

    }
}

