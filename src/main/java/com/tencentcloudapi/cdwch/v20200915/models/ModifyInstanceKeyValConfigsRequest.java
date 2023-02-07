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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceKeyValConfigsRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 新增配置列表
    */
    @SerializedName("AddItems")
    @Expose
    private InstanceConfigItem [] AddItems;

    /**
    * 更新配置列表
    */
    @SerializedName("UpdateItems")
    @Expose
    private InstanceConfigItem [] UpdateItems;

    /**
    * 删除配置列表
    */
    @SerializedName("DeleteItems")
    @Expose
    private InstanceConfigItem DeleteItems;

    /**
    * 删除配置列表
    */
    @SerializedName("DelItems")
    @Expose
    private InstanceConfigItem [] DelItems;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 新增配置列表 
     * @return AddItems 新增配置列表
     */
    public InstanceConfigItem [] getAddItems() {
        return this.AddItems;
    }

    /**
     * Set 新增配置列表
     * @param AddItems 新增配置列表
     */
    public void setAddItems(InstanceConfigItem [] AddItems) {
        this.AddItems = AddItems;
    }

    /**
     * Get 更新配置列表 
     * @return UpdateItems 更新配置列表
     */
    public InstanceConfigItem [] getUpdateItems() {
        return this.UpdateItems;
    }

    /**
     * Set 更新配置列表
     * @param UpdateItems 更新配置列表
     */
    public void setUpdateItems(InstanceConfigItem [] UpdateItems) {
        this.UpdateItems = UpdateItems;
    }

    /**
     * Get 删除配置列表 
     * @return DeleteItems 删除配置列表
     */
    public InstanceConfigItem getDeleteItems() {
        return this.DeleteItems;
    }

    /**
     * Set 删除配置列表
     * @param DeleteItems 删除配置列表
     */
    public void setDeleteItems(InstanceConfigItem DeleteItems) {
        this.DeleteItems = DeleteItems;
    }

    /**
     * Get 删除配置列表 
     * @return DelItems 删除配置列表
     */
    public InstanceConfigItem [] getDelItems() {
        return this.DelItems;
    }

    /**
     * Set 删除配置列表
     * @param DelItems 删除配置列表
     */
    public void setDelItems(InstanceConfigItem [] DelItems) {
        this.DelItems = DelItems;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyInstanceKeyValConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceKeyValConfigsRequest(ModifyInstanceKeyValConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AddItems != null) {
            this.AddItems = new InstanceConfigItem[source.AddItems.length];
            for (int i = 0; i < source.AddItems.length; i++) {
                this.AddItems[i] = new InstanceConfigItem(source.AddItems[i]);
            }
        }
        if (source.UpdateItems != null) {
            this.UpdateItems = new InstanceConfigItem[source.UpdateItems.length];
            for (int i = 0; i < source.UpdateItems.length; i++) {
                this.UpdateItems[i] = new InstanceConfigItem(source.UpdateItems[i]);
            }
        }
        if (source.DeleteItems != null) {
            this.DeleteItems = new InstanceConfigItem(source.DeleteItems);
        }
        if (source.DelItems != null) {
            this.DelItems = new InstanceConfigItem[source.DelItems.length];
            for (int i = 0; i < source.DelItems.length; i++) {
                this.DelItems[i] = new InstanceConfigItem(source.DelItems[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "AddItems.", this.AddItems);
        this.setParamArrayObj(map, prefix + "UpdateItems.", this.UpdateItems);
        this.setParamObj(map, prefix + "DeleteItems.", this.DeleteItems);
        this.setParamArrayObj(map, prefix + "DelItems.", this.DelItems);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

