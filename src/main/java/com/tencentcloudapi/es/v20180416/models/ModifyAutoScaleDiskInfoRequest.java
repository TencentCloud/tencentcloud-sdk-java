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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoScaleDiskInfoRequest extends AbstractModel {

    /**
    * 实例名称
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 自动扩盘参数列表
    */
    @SerializedName("AutoScaleDiskInfoList")
    @Expose
    private AutoScaleDiskInfo [] AutoScaleDiskInfoList;

    /**
    * 需要删除的自动扩盘节点类型
    */
    @SerializedName("DeleteNodeTypeList")
    @Expose
    private String [] DeleteNodeTypeList;

    /**
     * Get 实例名称 
     * @return InstanceId 实例名称
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例名称
     * @param InstanceId 实例名称
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 自动扩盘参数列表 
     * @return AutoScaleDiskInfoList 自动扩盘参数列表
     */
    public AutoScaleDiskInfo [] getAutoScaleDiskInfoList() {
        return this.AutoScaleDiskInfoList;
    }

    /**
     * Set 自动扩盘参数列表
     * @param AutoScaleDiskInfoList 自动扩盘参数列表
     */
    public void setAutoScaleDiskInfoList(AutoScaleDiskInfo [] AutoScaleDiskInfoList) {
        this.AutoScaleDiskInfoList = AutoScaleDiskInfoList;
    }

    /**
     * Get 需要删除的自动扩盘节点类型 
     * @return DeleteNodeTypeList 需要删除的自动扩盘节点类型
     */
    public String [] getDeleteNodeTypeList() {
        return this.DeleteNodeTypeList;
    }

    /**
     * Set 需要删除的自动扩盘节点类型
     * @param DeleteNodeTypeList 需要删除的自动扩盘节点类型
     */
    public void setDeleteNodeTypeList(String [] DeleteNodeTypeList) {
        this.DeleteNodeTypeList = DeleteNodeTypeList;
    }

    public ModifyAutoScaleDiskInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoScaleDiskInfoRequest(ModifyAutoScaleDiskInfoRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AutoScaleDiskInfoList != null) {
            this.AutoScaleDiskInfoList = new AutoScaleDiskInfo[source.AutoScaleDiskInfoList.length];
            for (int i = 0; i < source.AutoScaleDiskInfoList.length; i++) {
                this.AutoScaleDiskInfoList[i] = new AutoScaleDiskInfo(source.AutoScaleDiskInfoList[i]);
            }
        }
        if (source.DeleteNodeTypeList != null) {
            this.DeleteNodeTypeList = new String[source.DeleteNodeTypeList.length];
            for (int i = 0; i < source.DeleteNodeTypeList.length; i++) {
                this.DeleteNodeTypeList[i] = new String(source.DeleteNodeTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "AutoScaleDiskInfoList.", this.AutoScaleDiskInfoList);
        this.setParamArraySimple(map, prefix + "DeleteNodeTypeList.", this.DeleteNodeTypeList);

    }
}

