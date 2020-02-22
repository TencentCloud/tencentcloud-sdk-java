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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Topic extends AbstractModel{

    /**
    * TopicId
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Topic名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 消息最大生命周期
    */
    @SerializedName("MsgLife")
    @Expose
    private Long MsgLife;

    /**
    * 消息最大大小
    */
    @SerializedName("MsgSize")
    @Expose
    private Long MsgSize;

    /**
    * 消息最大数量
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * 已删除
    */
    @SerializedName("Deleted")
    @Expose
    private Long Deleted;

    /**
    * Topic完整路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get TopicId 
     * @return TopicId TopicId
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set TopicId
     * @param TopicId TopicId
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Topic名称 
     * @return TopicName Topic名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic名称
     * @param TopicName Topic名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 消息最大生命周期 
     * @return MsgLife 消息最大生命周期
     */
    public Long getMsgLife() {
        return this.MsgLife;
    }

    /**
     * Set 消息最大生命周期
     * @param MsgLife 消息最大生命周期
     */
    public void setMsgLife(Long MsgLife) {
        this.MsgLife = MsgLife;
    }

    /**
     * Get 消息最大大小 
     * @return MsgSize 消息最大大小
     */
    public Long getMsgSize() {
        return this.MsgSize;
    }

    /**
     * Set 消息最大大小
     * @param MsgSize 消息最大大小
     */
    public void setMsgSize(Long MsgSize) {
        this.MsgSize = MsgSize;
    }

    /**
     * Get 消息最大数量 
     * @return MsgCount 消息最大数量
     */
    public Long getMsgCount() {
        return this.MsgCount;
    }

    /**
     * Set 消息最大数量
     * @param MsgCount 消息最大数量
     */
    public void setMsgCount(Long MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * Get 已删除 
     * @return Deleted 已删除
     */
    public Long getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 已删除
     * @param Deleted 已删除
     */
    public void setDeleted(Long Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get Topic完整路径 
     * @return Path Topic完整路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Topic完整路径
     * @param Path Topic完整路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "MsgLife", this.MsgLife);
        this.setParamSimple(map, prefix + "MsgSize", this.MsgSize);
        this.setParamSimple(map, prefix + "MsgCount", this.MsgCount);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

