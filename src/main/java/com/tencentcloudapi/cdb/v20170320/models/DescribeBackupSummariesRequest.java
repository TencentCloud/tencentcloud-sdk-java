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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupSummariesRequest extends AbstractModel{

    /**
    * 需要查询的云数据库产品类型，目前仅支持 "mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 分页查询数据的偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询数据的条目限制，默认值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 指定按某一项排序，可选值包括： BackupVolume: 备份容量， DataBackupVolume: 数据备份容量， BinlogBackupVolume: 日志备份容量， AutoBackupVolume: 自动备份容量， ManualBackupVolume: 手动备份容量。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 指定排序方向，可选值包括： ASC: 正序， DESC: 逆序。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 需要查询的云数据库产品类型，目前仅支持 "mysql"。 
     * @return Product 需要查询的云数据库产品类型，目前仅支持 "mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 需要查询的云数据库产品类型，目前仅支持 "mysql"。
     * @param Product 需要查询的云数据库产品类型，目前仅支持 "mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 分页查询数据的偏移量。 
     * @return Offset 分页查询数据的偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询数据的偏移量。
     * @param Offset 分页查询数据的偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询数据的条目限制，默认值为20。 
     * @return Limit 分页查询数据的条目限制，默认值为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询数据的条目限制，默认值为20。
     * @param Limit 分页查询数据的条目限制，默认值为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 指定按某一项排序，可选值包括： BackupVolume: 备份容量， DataBackupVolume: 数据备份容量， BinlogBackupVolume: 日志备份容量， AutoBackupVolume: 自动备份容量， ManualBackupVolume: 手动备份容量。 
     * @return OrderBy 指定按某一项排序，可选值包括： BackupVolume: 备份容量， DataBackupVolume: 数据备份容量， BinlogBackupVolume: 日志备份容量， AutoBackupVolume: 自动备份容量， ManualBackupVolume: 手动备份容量。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 指定按某一项排序，可选值包括： BackupVolume: 备份容量， DataBackupVolume: 数据备份容量， BinlogBackupVolume: 日志备份容量， AutoBackupVolume: 自动备份容量， ManualBackupVolume: 手动备份容量。
     * @param OrderBy 指定按某一项排序，可选值包括： BackupVolume: 备份容量， DataBackupVolume: 数据备份容量， BinlogBackupVolume: 日志备份容量， AutoBackupVolume: 自动备份容量， ManualBackupVolume: 手动备份容量。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 指定排序方向，可选值包括： ASC: 正序， DESC: 逆序。 
     * @return OrderDirection 指定排序方向，可选值包括： ASC: 正序， DESC: 逆序。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 指定排序方向，可选值包括： ASC: 正序， DESC: 逆序。
     * @param OrderDirection 指定排序方向，可选值包括： ASC: 正序， DESC: 逆序。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

