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
package com.tencentcloudapi.tan.v20220420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBlockNodeRecordsRequest extends AbstractModel{

    /**
    * 盘查组id，可在“盘查组概览”功能中获取。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 节点id，可在“数据接入管理”中获取。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点数据json，具体demo请参考输入示例，其中key为数据接入管理中节点内创建的属性变量名，value为期望的推送值。
    */
    @SerializedName("Records")
    @Expose
    private String Records;

    /**
     * Get 盘查组id，可在“盘查组概览”功能中获取。 
     * @return GroupId 盘查组id，可在“盘查组概览”功能中获取。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 盘查组id，可在“盘查组概览”功能中获取。
     * @param GroupId 盘查组id，可在“盘查组概览”功能中获取。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 节点id，可在“数据接入管理”中获取。 
     * @return NodeId 节点id，可在“数据接入管理”中获取。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id，可在“数据接入管理”中获取。
     * @param NodeId 节点id，可在“数据接入管理”中获取。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点数据json，具体demo请参考输入示例，其中key为数据接入管理中节点内创建的属性变量名，value为期望的推送值。 
     * @return Records 节点数据json，具体demo请参考输入示例，其中key为数据接入管理中节点内创建的属性变量名，value为期望的推送值。
     */
    public String getRecords() {
        return this.Records;
    }

    /**
     * Set 节点数据json，具体demo请参考输入示例，其中key为数据接入管理中节点内创建的属性变量名，value为期望的推送值。
     * @param Records 节点数据json，具体demo请参考输入示例，其中key为数据接入管理中节点内创建的属性变量名，value为期望的推送值。
     */
    public void setRecords(String Records) {
        this.Records = Records;
    }

    public CreateBlockNodeRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBlockNodeRecordsRequest(CreateBlockNodeRecordsRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Records != null) {
            this.Records = new String(source.Records);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Records", this.Records);

    }
}

