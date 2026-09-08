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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductIngestTaskItem extends AbstractModel {

    /**
    * <p>接入任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>接入任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>产品分组</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>0： 接入中</li><li>1： 已接入</li><li>2： 接入失败</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 删除失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>接入任务创建时间</p><p>单位：ms</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>接入任务修改时间</p><p>单位：ms</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get <p>接入任务id</p> 
     * @return TaskId <p>接入任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>接入任务id</p>
     * @param TaskId <p>接入任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>接入任务名称</p> 
     * @return Name <p>接入任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>接入任务名称</p>
     * @param Name <p>接入任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>产品分组</p> 
     * @return Product <p>产品分组</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>产品分组</p>
     * @param Product <p>产品分组</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>0： 接入中</li><li>1： 已接入</li><li>2： 接入失败</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 删除失败</li></ul> 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>0： 接入中</li><li>1： 已接入</li><li>2： 接入失败</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 删除失败</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>0： 接入中</li><li>1： 已接入</li><li>2： 接入失败</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 删除失败</li></ul>
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>0： 接入中</li><li>1： 已接入</li><li>2： 接入失败</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 删除失败</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>接入任务创建时间</p><p>单位：ms</p> 
     * @return CreateTime <p>接入任务创建时间</p><p>单位：ms</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>接入任务创建时间</p><p>单位：ms</p>
     * @param CreateTime <p>接入任务创建时间</p><p>单位：ms</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>接入任务修改时间</p><p>单位：ms</p> 
     * @return UpdateTime <p>接入任务修改时间</p><p>单位：ms</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>接入任务修改时间</p><p>单位：ms</p>
     * @param UpdateTime <p>接入任务修改时间</p><p>单位：ms</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ProductIngestTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductIngestTaskItem(ProductIngestTaskItem source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

