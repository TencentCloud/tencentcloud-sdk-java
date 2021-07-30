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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyForwardRuleRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 消息类型
    */
    @SerializedName("MsgType")
    @Expose
    private Long MsgType;

    /**
    * 控制台Skey
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
    * 队列区域
    */
    @SerializedName("QueueRegion")
    @Expose
    private String QueueRegion;

    /**
    * 队列类型 0.CMQ 1.CKafka
    */
    @SerializedName("QueueType")
    @Expose
    private Long QueueType;

    /**
    * 临时密钥
    */
    @SerializedName("Consecretid")
    @Expose
    private String Consecretid;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 队列或主题ID
    */
    @SerializedName("QueueID")
    @Expose
    private String QueueID;

    /**
    * 队列或主题名称
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 消息类型 
     * @return MsgType 消息类型
     */
    public Long getMsgType() {
        return this.MsgType;
    }

    /**
     * Set 消息类型
     * @param MsgType 消息类型
     */
    public void setMsgType(Long MsgType) {
        this.MsgType = MsgType;
    }

    /**
     * Get 控制台Skey 
     * @return Skey 控制台Skey
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set 控制台Skey
     * @param Skey 控制台Skey
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Get 队列区域 
     * @return QueueRegion 队列区域
     */
    public String getQueueRegion() {
        return this.QueueRegion;
    }

    /**
     * Set 队列区域
     * @param QueueRegion 队列区域
     */
    public void setQueueRegion(String QueueRegion) {
        this.QueueRegion = QueueRegion;
    }

    /**
     * Get 队列类型 0.CMQ 1.CKafka 
     * @return QueueType 队列类型 0.CMQ 1.CKafka
     */
    public Long getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 队列类型 0.CMQ 1.CKafka
     * @param QueueType 队列类型 0.CMQ 1.CKafka
     */
    public void setQueueType(Long QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get 临时密钥 
     * @return Consecretid 临时密钥
     */
    public String getConsecretid() {
        return this.Consecretid;
    }

    /**
     * Set 临时密钥
     * @param Consecretid 临时密钥
     */
    public void setConsecretid(String Consecretid) {
        this.Consecretid = Consecretid;
    }

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
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 队列或主题ID 
     * @return QueueID 队列或主题ID
     */
    public String getQueueID() {
        return this.QueueID;
    }

    /**
     * Set 队列或主题ID
     * @param QueueID 队列或主题ID
     */
    public void setQueueID(String QueueID) {
        this.QueueID = QueueID;
    }

    /**
     * Get 队列或主题名称 
     * @return QueueName 队列或主题名称
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列或主题名称
     * @param QueueName 队列或主题名称
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    public ModifyForwardRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyForwardRuleRequest(ModifyForwardRuleRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.MsgType != null) {
            this.MsgType = new Long(source.MsgType);
        }
        if (source.Skey != null) {
            this.Skey = new String(source.Skey);
        }
        if (source.QueueRegion != null) {
            this.QueueRegion = new String(source.QueueRegion);
        }
        if (source.QueueType != null) {
            this.QueueType = new Long(source.QueueType);
        }
        if (source.Consecretid != null) {
            this.Consecretid = new String(source.Consecretid);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.QueueID != null) {
            this.QueueID = new String(source.QueueID);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "MsgType", this.MsgType);
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "QueueRegion", this.QueueRegion);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "Consecretid", this.Consecretid);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "QueueID", this.QueueID);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);

    }
}

