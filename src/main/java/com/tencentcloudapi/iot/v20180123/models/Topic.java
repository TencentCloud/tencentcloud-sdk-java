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

public class Topic  extends AbstractModel{

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
    private Integer MsgLife;

    /**
    * 消息最大大小
    */
    @SerializedName("MsgSize")
    @Expose
    private Integer MsgSize;

    /**
    * 消息最大数量
    */
    @SerializedName("MsgCount")
    @Expose
    private Integer MsgCount;

    /**
    * 已删除
    */
    @SerializedName("Deleted")
    @Expose
    private Integer Deleted;

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
     * 获取TopicId
     * @return TopicId TopicId
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * 设置TopicId
     * @param TopicId TopicId
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * 获取Topic名称
     * @return TopicName Topic名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * 设置Topic名称
     * @param TopicName Topic名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * 获取产品Id
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取消息最大生命周期
     * @return MsgLife 消息最大生命周期
     */
    public Integer getMsgLife() {
        return this.MsgLife;
    }

    /**
     * 设置消息最大生命周期
     * @param MsgLife 消息最大生命周期
     */
    public void setMsgLife(Integer MsgLife) {
        this.MsgLife = MsgLife;
    }

    /**
     * 获取消息最大大小
     * @return MsgSize 消息最大大小
     */
    public Integer getMsgSize() {
        return this.MsgSize;
    }

    /**
     * 设置消息最大大小
     * @param MsgSize 消息最大大小
     */
    public void setMsgSize(Integer MsgSize) {
        this.MsgSize = MsgSize;
    }

    /**
     * 获取消息最大数量
     * @return MsgCount 消息最大数量
     */
    public Integer getMsgCount() {
        return this.MsgCount;
    }

    /**
     * 设置消息最大数量
     * @param MsgCount 消息最大数量
     */
    public void setMsgCount(Integer MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * 获取已删除
     * @return Deleted 已删除
     */
    public Integer getDeleted() {
        return this.Deleted;
    }

    /**
     * 设置已删除
     * @param Deleted 已删除
     */
    public void setDeleted(Integer Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * 获取Topic完整路径
     * @return Path Topic完整路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * 设置Topic完整路径
     * @param Path Topic完整路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取更新时间
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
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

