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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileBackupObjectsRequest extends AbstractModel {

    /**
    * <p>备份实例ID</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * <p>浏览路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>偏移量，默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认50，最大1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>排序字段</p><p>枚举值：</p><ul><li>name： 文件名称</li></ul><p>默认值：name</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>排序方式</p><p>枚举值：</p><ul><li>asc： 升序排序</li><li>desc： 降序排序</li></ul><p>默认值：asc</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>返回模式</p><p>枚举值：</p><ul><li>all： 返回目录和文件</li><li>dir： 仅返回目录</li><li>file： 仅返回文件（含符号连接）</li></ul>
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
     * Get <p>备份实例ID</p> 
     * @return BackupId <p>备份实例ID</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>备份实例ID</p>
     * @param BackupId <p>备份实例ID</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>浏览路径</p> 
     * @return Path <p>浏览路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>浏览路径</p>
     * @param Path <p>浏览路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>偏移量，默认0</p> 
     * @return Offset <p>偏移量，默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认0</p>
     * @param Offset <p>偏移量，默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认50，最大1000</p> 
     * @return Limit <p>返回数量，默认50，最大1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认50，最大1000</p>
     * @param Limit <p>返回数量，默认50，最大1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>排序字段</p><p>枚举值：</p><ul><li>name： 文件名称</li></ul><p>默认值：name</p> 
     * @return OrderField <p>排序字段</p><p>枚举值：</p><ul><li>name： 文件名称</li></ul><p>默认值：name</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序字段</p><p>枚举值：</p><ul><li>name： 文件名称</li></ul><p>默认值：name</p>
     * @param OrderField <p>排序字段</p><p>枚举值：</p><ul><li>name： 文件名称</li></ul><p>默认值：name</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>排序方式</p><p>枚举值：</p><ul><li>asc： 升序排序</li><li>desc： 降序排序</li></ul><p>默认值：asc</p> 
     * @return Order <p>排序方式</p><p>枚举值：</p><ul><li>asc： 升序排序</li><li>desc： 降序排序</li></ul><p>默认值：asc</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式</p><p>枚举值：</p><ul><li>asc： 升序排序</li><li>desc： 降序排序</li></ul><p>默认值：asc</p>
     * @param Order <p>排序方式</p><p>枚举值：</p><ul><li>asc： 升序排序</li><li>desc： 降序排序</li></ul><p>默认值：asc</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>返回模式</p><p>枚举值：</p><ul><li>all： 返回目录和文件</li><li>dir： 仅返回目录</li><li>file： 仅返回文件（含符号连接）</li></ul> 
     * @return ObjectType <p>返回模式</p><p>枚举值：</p><ul><li>all： 返回目录和文件</li><li>dir： 仅返回目录</li><li>file： 仅返回文件（含符号连接）</li></ul>
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set <p>返回模式</p><p>枚举值：</p><ul><li>all： 返回目录和文件</li><li>dir： 仅返回目录</li><li>file： 仅返回文件（含符号连接）</li></ul>
     * @param ObjectType <p>返回模式</p><p>枚举值：</p><ul><li>all： 返回目录和文件</li><li>dir： 仅返回目录</li><li>file： 仅返回文件（含符号连接）</li></ul>
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    public DescribeFileBackupObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileBackupObjectsRequest(DescribeFileBackupObjectsRequest source) {
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);

    }
}

