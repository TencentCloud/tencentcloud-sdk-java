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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicPolicyRequest  extends AbstractModel{

    /**
    * 产品自身id
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * Topic名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Topic权限，1发布，2订阅，3订阅和发布
    */
    @SerializedName("Privilege")
    @Expose
    private Integer Privilege;

    /**
    * 代理订阅信息，网关产品为绑定的子产品创建topic时需要填写，内容为子产品的id和设备信息。
    */
    @SerializedName("BrokerSubscribe")
    @Expose
    private BrokerSubscribe BrokerSubscribe;

    /**
     * 获取产品自身id
     * @return ProductID 产品自身id
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * 设置产品自身id
     * @param ProductID 产品自身id
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
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
     * 获取Topic权限，1发布，2订阅，3订阅和发布
     * @return Privilege Topic权限，1发布，2订阅，3订阅和发布
     */
    public Integer getPrivilege() {
        return this.Privilege;
    }

    /**
     * 设置Topic权限，1发布，2订阅，3订阅和发布
     * @param Privilege Topic权限，1发布，2订阅，3订阅和发布
     */
    public void setPrivilege(Integer Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * 获取代理订阅信息，网关产品为绑定的子产品创建topic时需要填写，内容为子产品的id和设备信息。
     * @return BrokerSubscribe 代理订阅信息，网关产品为绑定的子产品创建topic时需要填写，内容为子产品的id和设备信息。
     */
    public BrokerSubscribe getBrokerSubscribe() {
        return this.BrokerSubscribe;
    }

    /**
     * 设置代理订阅信息，网关产品为绑定的子产品创建topic时需要填写，内容为子产品的id和设备信息。
     * @param BrokerSubscribe 代理订阅信息，网关产品为绑定的子产品创建topic时需要填写，内容为子产品的id和设备信息。
     */
    public void setBrokerSubscribe(BrokerSubscribe BrokerSubscribe) {
        this.BrokerSubscribe = BrokerSubscribe;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamObj(map, prefix + "BrokerSubscribe.", this.BrokerSubscribe);

    }
}

