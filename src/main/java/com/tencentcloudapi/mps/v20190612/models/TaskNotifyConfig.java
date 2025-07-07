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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskNotifyConfig extends AbstractModel {

    /**
    * 通知类型，可选值：
<li>CMQ：已下线，建议切换到TDMQ-CMQ</li>
<li>TDMQ-CMQ：消息队列</li>
<li>URL：指定URL时HTTP回调推送到 NotifyUrl 指定的地址，回调协议http+json，包体内容同解析事件通知接口的输出参数 </li>
<li>SCF：不推荐使用，需要在控制台额外配置SCF</li>
<li>AWS-SQS：AWS 队列，只适用于 AWS 任务，且要求同区域</li>
<font color="red"> 注：不填或为空时默认 CMQ，如需采用其他类型需填写对应类型值。 </font>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 工作流通知的模式，可取值有 Finish 和 Change，不填代表 Finish。
    */
    @SerializedName("NotifyMode")
    @Expose
    private String NotifyMode;

    /**
    * HTTP回调地址，NotifyType为URL时必填。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * CMQ或TDMQ-CMQ 的模型，有 Queue 和 Topic 两种。
    */
    @SerializedName("CmqModel")
    @Expose
    private String CmqModel;

    /**
    * CMQ或TDMQ-CMQ 的园区，如 sh，bj 等。
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * 当模型为 Topic 时有效，表示接收事件通知的 CMQ 或 TDMQ-CMQ 的主题名。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 当模型为 Queue 时有效，表示接收事件通知的 CMQ 或 TDMQ-CMQ 的队列名。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * AWS SQS 回调，NotifyType为 AWS-SQS 时必填。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AwsSQS")
    @Expose
    private AwsSQS AwsSQS;

    /**
    * 用于生成回调签名的key。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyKey")
    @Expose
    private String NotifyKey;

    /**
     * Get 通知类型，可选值：
<li>CMQ：已下线，建议切换到TDMQ-CMQ</li>
<li>TDMQ-CMQ：消息队列</li>
<li>URL：指定URL时HTTP回调推送到 NotifyUrl 指定的地址，回调协议http+json，包体内容同解析事件通知接口的输出参数 </li>
<li>SCF：不推荐使用，需要在控制台额外配置SCF</li>
<li>AWS-SQS：AWS 队列，只适用于 AWS 任务，且要求同区域</li>
<font color="red"> 注：不填或为空时默认 CMQ，如需采用其他类型需填写对应类型值。 </font> 
     * @return NotifyType 通知类型，可选值：
<li>CMQ：已下线，建议切换到TDMQ-CMQ</li>
<li>TDMQ-CMQ：消息队列</li>
<li>URL：指定URL时HTTP回调推送到 NotifyUrl 指定的地址，回调协议http+json，包体内容同解析事件通知接口的输出参数 </li>
<li>SCF：不推荐使用，需要在控制台额外配置SCF</li>
<li>AWS-SQS：AWS 队列，只适用于 AWS 任务，且要求同区域</li>
<font color="red"> 注：不填或为空时默认 CMQ，如需采用其他类型需填写对应类型值。 </font>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知类型，可选值：
<li>CMQ：已下线，建议切换到TDMQ-CMQ</li>
<li>TDMQ-CMQ：消息队列</li>
<li>URL：指定URL时HTTP回调推送到 NotifyUrl 指定的地址，回调协议http+json，包体内容同解析事件通知接口的输出参数 </li>
<li>SCF：不推荐使用，需要在控制台额外配置SCF</li>
<li>AWS-SQS：AWS 队列，只适用于 AWS 任务，且要求同区域</li>
<font color="red"> 注：不填或为空时默认 CMQ，如需采用其他类型需填写对应类型值。 </font>
     * @param NotifyType 通知类型，可选值：
<li>CMQ：已下线，建议切换到TDMQ-CMQ</li>
<li>TDMQ-CMQ：消息队列</li>
<li>URL：指定URL时HTTP回调推送到 NotifyUrl 指定的地址，回调协议http+json，包体内容同解析事件通知接口的输出参数 </li>
<li>SCF：不推荐使用，需要在控制台额外配置SCF</li>
<li>AWS-SQS：AWS 队列，只适用于 AWS 任务，且要求同区域</li>
<font color="red"> 注：不填或为空时默认 CMQ，如需采用其他类型需填写对应类型值。 </font>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get 工作流通知的模式，可取值有 Finish 和 Change，不填代表 Finish。 
     * @return NotifyMode 工作流通知的模式，可取值有 Finish 和 Change，不填代表 Finish。
     */
    public String getNotifyMode() {
        return this.NotifyMode;
    }

    /**
     * Set 工作流通知的模式，可取值有 Finish 和 Change，不填代表 Finish。
     * @param NotifyMode 工作流通知的模式，可取值有 Finish 和 Change，不填代表 Finish。
     */
    public void setNotifyMode(String NotifyMode) {
        this.NotifyMode = NotifyMode;
    }

    /**
     * Get HTTP回调地址，NotifyType为URL时必填。 
     * @return NotifyUrl HTTP回调地址，NotifyType为URL时必填。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set HTTP回调地址，NotifyType为URL时必填。
     * @param NotifyUrl HTTP回调地址，NotifyType为URL时必填。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get CMQ或TDMQ-CMQ 的模型，有 Queue 和 Topic 两种。 
     * @return CmqModel CMQ或TDMQ-CMQ 的模型，有 Queue 和 Topic 两种。
     */
    public String getCmqModel() {
        return this.CmqModel;
    }

    /**
     * Set CMQ或TDMQ-CMQ 的模型，有 Queue 和 Topic 两种。
     * @param CmqModel CMQ或TDMQ-CMQ 的模型，有 Queue 和 Topic 两种。
     */
    public void setCmqModel(String CmqModel) {
        this.CmqModel = CmqModel;
    }

    /**
     * Get CMQ或TDMQ-CMQ 的园区，如 sh，bj 等。 
     * @return CmqRegion CMQ或TDMQ-CMQ 的园区，如 sh，bj 等。
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set CMQ或TDMQ-CMQ 的园区，如 sh，bj 等。
     * @param CmqRegion CMQ或TDMQ-CMQ 的园区，如 sh，bj 等。
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get 当模型为 Topic 时有效，表示接收事件通知的 CMQ 或 TDMQ-CMQ 的主题名。 
     * @return TopicName 当模型为 Topic 时有效，表示接收事件通知的 CMQ 或 TDMQ-CMQ 的主题名。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 当模型为 Topic 时有效，表示接收事件通知的 CMQ 或 TDMQ-CMQ 的主题名。
     * @param TopicName 当模型为 Topic 时有效，表示接收事件通知的 CMQ 或 TDMQ-CMQ 的主题名。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 当模型为 Queue 时有效，表示接收事件通知的 CMQ 或 TDMQ-CMQ 的队列名。 
     * @return QueueName 当模型为 Queue 时有效，表示接收事件通知的 CMQ 或 TDMQ-CMQ 的队列名。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 当模型为 Queue 时有效，表示接收事件通知的 CMQ 或 TDMQ-CMQ 的队列名。
     * @param QueueName 当模型为 Queue 时有效，表示接收事件通知的 CMQ 或 TDMQ-CMQ 的队列名。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get AWS SQS 回调，NotifyType为 AWS-SQS 时必填。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return AwsSQS AWS SQS 回调，NotifyType为 AWS-SQS 时必填。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public AwsSQS getAwsSQS() {
        return this.AwsSQS;
    }

    /**
     * Set AWS SQS 回调，NotifyType为 AWS-SQS 时必填。

注意：此字段可能返回 null，表示取不到有效值。
     * @param AwsSQS AWS SQS 回调，NotifyType为 AWS-SQS 时必填。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAwsSQS(AwsSQS AwsSQS) {
        this.AwsSQS = AwsSQS;
    }

    /**
     * Get 用于生成回调签名的key。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyKey 用于生成回调签名的key。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotifyKey() {
        return this.NotifyKey;
    }

    /**
     * Set 用于生成回调签名的key。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyKey 用于生成回调签名的key。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyKey(String NotifyKey) {
        this.NotifyKey = NotifyKey;
    }

    public TaskNotifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskNotifyConfig(TaskNotifyConfig source) {
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.NotifyMode != null) {
            this.NotifyMode = new String(source.NotifyMode);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.CmqModel != null) {
            this.CmqModel = new String(source.CmqModel);
        }
        if (source.CmqRegion != null) {
            this.CmqRegion = new String(source.CmqRegion);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.AwsSQS != null) {
            this.AwsSQS = new AwsSQS(source.AwsSQS);
        }
        if (source.NotifyKey != null) {
            this.NotifyKey = new String(source.NotifyKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "NotifyMode", this.NotifyMode);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "CmqModel", this.CmqModel);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamObj(map, prefix + "AwsSQS.", this.AwsSQS);
        this.setParamSimple(map, prefix + "NotifyKey", this.NotifyKey);

    }
}

