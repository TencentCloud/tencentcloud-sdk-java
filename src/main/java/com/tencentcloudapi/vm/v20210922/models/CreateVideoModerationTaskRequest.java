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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoModerationTaskRequest extends AbstractModel {

    /**
    * 该字段表示特定审核策略的编号，用于接口调度。需要提前在[内容安全控制台](https://console.cloud.tencent.com/cms/clouds/manage)中创建策略后获取该Biztype字段，传入该字段，会根据业务场景在审核时调用相应的审核策略。 备注：Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 任务类型：可选VIDEO（点播视频），LIVE_VIDEO（直播视频），VIDEO_AIGC（AI生成检测）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 输入的任务信息，最多可以同时创建10个任务
    */
    @SerializedName("Tasks")
    @Expose
    private TaskInput [] Tasks;

    /**
    * 可选参数，该字段表示回调签名的key信息，用于保证数据的安全性。 签名方法为在返回的HTTP头部添加 X-Signature 的字段，值为： seed + body 的 SHA256 编码和Hex字符串，在收到回调数据后，可以根据返回的body，用 **sha256(seed + body)**, 计算出 `X-Signature` 进行验证。<br>具体使用实例可参考 [回调签名示例](https://cloud.tencent.com/document/product/1265/104001#42dd87d2-580f-46cf-a953-639a787d1eda)。
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * 接收审核信息回调地址。如果设置了该字段，在审核过程中发现违规音频片段和画面截帧结果将发送至该接口。更多详情请参阅[回调配置说明](https://cloud.tencent.com/document/product/1265/104001)。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 审核排队优先级。当您有多个视频审核任务排队时，可以根据这个参数控制排队优先级。用于处理插队等逻辑。默认该参数为0
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户
    */
    @SerializedName("User")
    @Expose
    private User User;

    /**
     * Get 该字段表示特定审核策略的编号，用于接口调度。需要提前在[内容安全控制台](https://console.cloud.tencent.com/cms/clouds/manage)中创建策略后获取该Biztype字段，传入该字段，会根据业务场景在审核时调用相应的审核策略。 备注：Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。 
     * @return BizType 该字段表示特定审核策略的编号，用于接口调度。需要提前在[内容安全控制台](https://console.cloud.tencent.com/cms/clouds/manage)中创建策略后获取该Biztype字段，传入该字段，会根据业务场景在审核时调用相应的审核策略。 备注：Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 该字段表示特定审核策略的编号，用于接口调度。需要提前在[内容安全控制台](https://console.cloud.tencent.com/cms/clouds/manage)中创建策略后获取该Biztype字段，传入该字段，会根据业务场景在审核时调用相应的审核策略。 备注：Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。
     * @param BizType 该字段表示特定审核策略的编号，用于接口调度。需要提前在[内容安全控制台](https://console.cloud.tencent.com/cms/clouds/manage)中创建策略后获取该Biztype字段，传入该字段，会根据业务场景在审核时调用相应的审核策略。 备注：Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 任务类型：可选VIDEO（点播视频），LIVE_VIDEO（直播视频），VIDEO_AIGC（AI生成检测） 
     * @return Type 任务类型：可选VIDEO（点播视频），LIVE_VIDEO（直播视频），VIDEO_AIGC（AI生成检测）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务类型：可选VIDEO（点播视频），LIVE_VIDEO（直播视频），VIDEO_AIGC（AI生成检测）
     * @param Type 任务类型：可选VIDEO（点播视频），LIVE_VIDEO（直播视频），VIDEO_AIGC（AI生成检测）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 输入的任务信息，最多可以同时创建10个任务 
     * @return Tasks 输入的任务信息，最多可以同时创建10个任务
     */
    public TaskInput [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 输入的任务信息，最多可以同时创建10个任务
     * @param Tasks 输入的任务信息，最多可以同时创建10个任务
     */
    public void setTasks(TaskInput [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 可选参数，该字段表示回调签名的key信息，用于保证数据的安全性。 签名方法为在返回的HTTP头部添加 X-Signature 的字段，值为： seed + body 的 SHA256 编码和Hex字符串，在收到回调数据后，可以根据返回的body，用 **sha256(seed + body)**, 计算出 `X-Signature` 进行验证。<br>具体使用实例可参考 [回调签名示例](https://cloud.tencent.com/document/product/1265/104001#42dd87d2-580f-46cf-a953-639a787d1eda)。 
     * @return Seed 可选参数，该字段表示回调签名的key信息，用于保证数据的安全性。 签名方法为在返回的HTTP头部添加 X-Signature 的字段，值为： seed + body 的 SHA256 编码和Hex字符串，在收到回调数据后，可以根据返回的body，用 **sha256(seed + body)**, 计算出 `X-Signature` 进行验证。<br>具体使用实例可参考 [回调签名示例](https://cloud.tencent.com/document/product/1265/104001#42dd87d2-580f-46cf-a953-639a787d1eda)。
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set 可选参数，该字段表示回调签名的key信息，用于保证数据的安全性。 签名方法为在返回的HTTP头部添加 X-Signature 的字段，值为： seed + body 的 SHA256 编码和Hex字符串，在收到回调数据后，可以根据返回的body，用 **sha256(seed + body)**, 计算出 `X-Signature` 进行验证。<br>具体使用实例可参考 [回调签名示例](https://cloud.tencent.com/document/product/1265/104001#42dd87d2-580f-46cf-a953-639a787d1eda)。
     * @param Seed 可选参数，该字段表示回调签名的key信息，用于保证数据的安全性。 签名方法为在返回的HTTP头部添加 X-Signature 的字段，值为： seed + body 的 SHA256 编码和Hex字符串，在收到回调数据后，可以根据返回的body，用 **sha256(seed + body)**, 计算出 `X-Signature` 进行验证。<br>具体使用实例可参考 [回调签名示例](https://cloud.tencent.com/document/product/1265/104001#42dd87d2-580f-46cf-a953-639a787d1eda)。
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
    }

    /**
     * Get 接收审核信息回调地址。如果设置了该字段，在审核过程中发现违规音频片段和画面截帧结果将发送至该接口。更多详情请参阅[回调配置说明](https://cloud.tencent.com/document/product/1265/104001)。 
     * @return CallbackUrl 接收审核信息回调地址。如果设置了该字段，在审核过程中发现违规音频片段和画面截帧结果将发送至该接口。更多详情请参阅[回调配置说明](https://cloud.tencent.com/document/product/1265/104001)。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 接收审核信息回调地址。如果设置了该字段，在审核过程中发现违规音频片段和画面截帧结果将发送至该接口。更多详情请参阅[回调配置说明](https://cloud.tencent.com/document/product/1265/104001)。
     * @param CallbackUrl 接收审核信息回调地址。如果设置了该字段，在审核过程中发现违规音频片段和画面截帧结果将发送至该接口。更多详情请参阅[回调配置说明](https://cloud.tencent.com/document/product/1265/104001)。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 审核排队优先级。当您有多个视频审核任务排队时，可以根据这个参数控制排队优先级。用于处理插队等逻辑。默认该参数为0 
     * @return Priority 审核排队优先级。当您有多个视频审核任务排队时，可以根据这个参数控制排队优先级。用于处理插队等逻辑。默认该参数为0
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 审核排队优先级。当您有多个视频审核任务排队时，可以根据这个参数控制排队优先级。用于处理插队等逻辑。默认该参数为0
     * @param Priority 审核排队优先级。当您有多个视频审核任务排队时，可以根据这个参数控制排队优先级。用于处理插队等逻辑。默认该参数为0
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户 
     * @return User 该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户
     */
    public User getUser() {
        return this.User;
    }

    /**
     * Set 该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户
     * @param User 该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户
     */
    public void setUser(User User) {
        this.User = User;
    }

    public CreateVideoModerationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoModerationTaskRequest(CreateVideoModerationTaskRequest source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskInput[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskInput(source.Tasks[i]);
            }
        }
        if (source.Seed != null) {
            this.Seed = new String(source.Seed);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.User != null) {
            this.User = new User(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamObj(map, prefix + "User.", this.User);

    }
}

