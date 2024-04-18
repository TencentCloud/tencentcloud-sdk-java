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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeliverCloudFunctionRequest extends AbstractModel {

    /**
    * 投递规则属于的 topic id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 投递的云函数名字。仅支持[事件函数](https://cloud.tencent.com/document/product/583/9694#scf-.E4.BA.8B.E4.BB.B6.E5.87.BD.E6.95.B0) （[函数类型选型](https://cloud.tencent.com/document/product/583/73483)）
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数版本
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 投递最长等待时间，单位：秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 投递最大消息数
    */
    @SerializedName("MaxMsgNum")
    @Expose
    private Long MaxMsgNum;

    /**
     * Get 投递规则属于的 topic id 
     * @return TopicId 投递规则属于的 topic id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 投递规则属于的 topic id
     * @param TopicId 投递规则属于的 topic id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 投递的云函数名字。仅支持[事件函数](https://cloud.tencent.com/document/product/583/9694#scf-.E4.BA.8B.E4.BB.B6.E5.87.BD.E6.95.B0) （[函数类型选型](https://cloud.tencent.com/document/product/583/73483)） 
     * @return FunctionName 投递的云函数名字。仅支持[事件函数](https://cloud.tencent.com/document/product/583/9694#scf-.E4.BA.8B.E4.BB.B6.E5.87.BD.E6.95.B0) （[函数类型选型](https://cloud.tencent.com/document/product/583/73483)）
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 投递的云函数名字。仅支持[事件函数](https://cloud.tencent.com/document/product/583/9694#scf-.E4.BA.8B.E4.BB.B6.E5.87.BD.E6.95.B0) （[函数类型选型](https://cloud.tencent.com/document/product/583/73483)）
     * @param FunctionName 投递的云函数名字。仅支持[事件函数](https://cloud.tencent.com/document/product/583/9694#scf-.E4.BA.8B.E4.BB.B6.E5.87.BD.E6.95.B0) （[函数类型选型](https://cloud.tencent.com/document/product/583/73483)）
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数版本 
     * @return Qualifier 函数版本
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数版本
     * @param Qualifier 函数版本
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 投递最长等待时间，单位：秒 
     * @return Timeout 投递最长等待时间，单位：秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 投递最长等待时间，单位：秒
     * @param Timeout 投递最长等待时间，单位：秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 投递最大消息数 
     * @return MaxMsgNum 投递最大消息数
     */
    public Long getMaxMsgNum() {
        return this.MaxMsgNum;
    }

    /**
     * Set 投递最大消息数
     * @param MaxMsgNum 投递最大消息数
     */
    public void setMaxMsgNum(Long MaxMsgNum) {
        this.MaxMsgNum = MaxMsgNum;
    }

    public CreateDeliverCloudFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeliverCloudFunctionRequest(CreateDeliverCloudFunctionRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.MaxMsgNum != null) {
            this.MaxMsgNum = new Long(source.MaxMsgNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "MaxMsgNum", this.MaxMsgNum);

    }
}

