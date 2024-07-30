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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceKeyValConfigsRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

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
    @SerializedName("DelItems")
    @Expose
    private InstanceConfigItem [] DelItems;

    /**
    * 备注（50字以内）
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 热更新列表
    */
    @SerializedName("HotUpdateItems")
    @Expose
    private InstanceConfigItem [] HotUpdateItems;

    /**
    * 删除配置列表
    */
    @SerializedName("DeleteItems")
    @Expose
    private InstanceConfigItem DeleteItems;

    /**
    * ip地址
    */
    @SerializedName("IPAddress")
    @Expose
    private String IPAddress;

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
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
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
     * Get 备注（50字以内） 
     * @return Message 备注（50字以内）
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 备注（50字以内）
     * @param Message 备注（50字以内）
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 热更新列表 
     * @return HotUpdateItems 热更新列表
     */
    public InstanceConfigItem [] getHotUpdateItems() {
        return this.HotUpdateItems;
    }

    /**
     * Set 热更新列表
     * @param HotUpdateItems 热更新列表
     */
    public void setHotUpdateItems(InstanceConfigItem [] HotUpdateItems) {
        this.HotUpdateItems = HotUpdateItems;
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
     * Get ip地址 
     * @return IPAddress ip地址
     */
    public String getIPAddress() {
        return this.IPAddress;
    }

    /**
     * Set ip地址
     * @param IPAddress ip地址
     */
    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
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
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
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
        if (source.DelItems != null) {
            this.DelItems = new InstanceConfigItem[source.DelItems.length];
            for (int i = 0; i < source.DelItems.length; i++) {
                this.DelItems[i] = new InstanceConfigItem(source.DelItems[i]);
            }
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.HotUpdateItems != null) {
            this.HotUpdateItems = new InstanceConfigItem[source.HotUpdateItems.length];
            for (int i = 0; i < source.HotUpdateItems.length; i++) {
                this.HotUpdateItems[i] = new InstanceConfigItem(source.HotUpdateItems[i]);
            }
        }
        if (source.DeleteItems != null) {
            this.DeleteItems = new InstanceConfigItem(source.DeleteItems);
        }
        if (source.IPAddress != null) {
            this.IPAddress = new String(source.IPAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArrayObj(map, prefix + "AddItems.", this.AddItems);
        this.setParamArrayObj(map, prefix + "UpdateItems.", this.UpdateItems);
        this.setParamArrayObj(map, prefix + "DelItems.", this.DelItems);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "HotUpdateItems.", this.HotUpdateItems);
        this.setParamObj(map, prefix + "DeleteItems.", this.DeleteItems);
        this.setParamSimple(map, prefix + "IPAddress", this.IPAddress);

    }
}

