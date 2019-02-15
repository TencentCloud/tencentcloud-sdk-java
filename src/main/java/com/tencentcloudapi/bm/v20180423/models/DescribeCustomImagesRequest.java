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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomImagesRequest  extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 排序字段，仅支持CreateTime
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式 0:递增(默认) 1:递减
    */
    @SerializedName("Order")
    @Expose
    private Integer Order;

    /**
    * 按ImageId查找指定镜像信息，ImageId字段存在时其他字段失效
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 模糊查询过滤，可以查询镜像ID或镜像名
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <ul>
镜像状态过滤列表，有效取值为：
<li>1：制作中</li>
<li>2：制作失败</li>
<li>3：正常</li>
<li>4：删除中</li>
</ul>
    */
    @SerializedName("ImageStatus")
    @Expose
    private Integer [] ImageStatus;

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取数量限制
     * @return Limit 数量限制
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置数量限制
     * @param Limit 数量限制
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取排序字段，仅支持CreateTime
     * @return OrderField 排序字段，仅支持CreateTime
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * 设置排序字段，仅支持CreateTime
     * @param OrderField 排序字段，仅支持CreateTime
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * 获取排序方式 0:递增(默认) 1:递减
     * @return Order 排序方式 0:递增(默认) 1:递减
     */
    public Integer getOrder() {
        return this.Order;
    }

    /**
     * 设置排序方式 0:递增(默认) 1:递减
     * @param Order 排序方式 0:递增(默认) 1:递减
     */
    public void setOrder(Integer Order) {
        this.Order = Order;
    }

    /**
     * 获取按ImageId查找指定镜像信息，ImageId字段存在时其他字段失效
     * @return ImageId 按ImageId查找指定镜像信息，ImageId字段存在时其他字段失效
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * 设置按ImageId查找指定镜像信息，ImageId字段存在时其他字段失效
     * @param ImageId 按ImageId查找指定镜像信息，ImageId字段存在时其他字段失效
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * 获取模糊查询过滤，可以查询镜像ID或镜像名
     * @return SearchKey 模糊查询过滤，可以查询镜像ID或镜像名
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * 设置模糊查询过滤，可以查询镜像ID或镜像名
     * @param SearchKey 模糊查询过滤，可以查询镜像ID或镜像名
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * 获取<ul>
镜像状态过滤列表，有效取值为：
<li>1：制作中</li>
<li>2：制作失败</li>
<li>3：正常</li>
<li>4：删除中</li>
</ul>
     * @return ImageStatus <ul>
镜像状态过滤列表，有效取值为：
<li>1：制作中</li>
<li>2：制作失败</li>
<li>3：正常</li>
<li>4：删除中</li>
</ul>
     */
    public Integer [] getImageStatus() {
        return this.ImageStatus;
    }

    /**
     * 设置<ul>
镜像状态过滤列表，有效取值为：
<li>1：制作中</li>
<li>2：制作失败</li>
<li>3：正常</li>
<li>4：删除中</li>
</ul>
     * @param ImageStatus <ul>
镜像状态过滤列表，有效取值为：
<li>1：制作中</li>
<li>2：制作失败</li>
<li>3：正常</li>
<li>4：删除中</li>
</ul>
     */
    public void setImageStatus(Integer [] ImageStatus) {
        this.ImageStatus = ImageStatus;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "ImageStatus.", this.ImageStatus);

    }
}

