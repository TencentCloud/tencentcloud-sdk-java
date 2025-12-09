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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextModerationRequest extends AbstractModel {

    /**
    * 待检测的文本内容，需为UTF-8编码并以Base64格式传入。
示例值：5L2g55qE5Lil6LCo6K6p5L2g5Y+R546w77yM5Lqn5ZOB57uP55CG5Y+r5YmR6Z2S

    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 接口使用的识别策略编号，需在[控制台](https://console.cloud.tencent.com/cms/clouds/manage)获取。详细获取方式请参考以下链接：
- **内容安全**（详见步骤四：策略配置）：[点击这里](https://cloud.tencent.com/document/product/1124/37119)
- **AI生成识别**（详见服务对接->方式二）：[点击这里](https://cloud.tencent.com/document/product/1124/118694)

示例值：TencentCloudDefault
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 该字段表示您为待检测文本分配的数据ID，作用是方便您对数据进行标识和管理。
取值：可由英文字母、数字、四种特殊符号（_，-，@，#）组成，**长度不超过64个字符**。
示例值：a6127dd-c2a0-43e7-a3da-d27022d39ba7
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。
    */
    @SerializedName("User")
    @Expose
    private User User;

    /**
    * 该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
    * Content字段的原始语种，枚举值包括 zh 和 en：
- 推荐使用 zh
- en 适用于纯英文内容，耗时较高。若需使用 en，请先通过[反馈工单](https://console.cloud.tencent.com/workorder/category?level1_id=141&level2_id=1287&source=14&data_title=%E6%96%87%E6%9C%AC%E5%86%85%E5%AE%B9%E5%AE%89%E5%85%A8&step=1)确认

示例值：zh

    */
    @SerializedName("SourceLanguage")
    @Expose
    private String SourceLanguage;

    /**
    * 服务类型，枚举值包括 TEXT 和 TEXT_AIGC：
TEXT：内容安全
TEXT_AIGC：AI生成识别
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 适用于上下文关联审核场景，若多条文本内容需要联合审核，通过该字段关联会话。
示例值：7e8f9a0b1c2d3e4f5a6b7c8d9e0f1a2b
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get 待检测的文本内容，需为UTF-8编码并以Base64格式传入。
示例值：5L2g55qE5Lil6LCo6K6p5L2g5Y+R546w77yM5Lqn5ZOB57uP55CG5Y+r5YmR6Z2S
 
     * @return Content 待检测的文本内容，需为UTF-8编码并以Base64格式传入。
示例值：5L2g55qE5Lil6LCo6K6p5L2g5Y+R546w77yM5Lqn5ZOB57uP55CG5Y+r5YmR6Z2S

     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 待检测的文本内容，需为UTF-8编码并以Base64格式传入。
示例值：5L2g55qE5Lil6LCo6K6p5L2g5Y+R546w77yM5Lqn5ZOB57uP55CG5Y+r5YmR6Z2S

     * @param Content 待检测的文本内容，需为UTF-8编码并以Base64格式传入。
示例值：5L2g55qE5Lil6LCo6K6p5L2g5Y+R546w77yM5Lqn5ZOB57uP55CG5Y+r5YmR6Z2S

     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 接口使用的识别策略编号，需在[控制台](https://console.cloud.tencent.com/cms/clouds/manage)获取。详细获取方式请参考以下链接：
- **内容安全**（详见步骤四：策略配置）：[点击这里](https://cloud.tencent.com/document/product/1124/37119)
- **AI生成识别**（详见服务对接->方式二）：[点击这里](https://cloud.tencent.com/document/product/1124/118694)

示例值：TencentCloudDefault 
     * @return BizType 接口使用的识别策略编号，需在[控制台](https://console.cloud.tencent.com/cms/clouds/manage)获取。详细获取方式请参考以下链接：
- **内容安全**（详见步骤四：策略配置）：[点击这里](https://cloud.tencent.com/document/product/1124/37119)
- **AI生成识别**（详见服务对接->方式二）：[点击这里](https://cloud.tencent.com/document/product/1124/118694)

示例值：TencentCloudDefault
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 接口使用的识别策略编号，需在[控制台](https://console.cloud.tencent.com/cms/clouds/manage)获取。详细获取方式请参考以下链接：
- **内容安全**（详见步骤四：策略配置）：[点击这里](https://cloud.tencent.com/document/product/1124/37119)
- **AI生成识别**（详见服务对接->方式二）：[点击这里](https://cloud.tencent.com/document/product/1124/118694)

示例值：TencentCloudDefault
     * @param BizType 接口使用的识别策略编号，需在[控制台](https://console.cloud.tencent.com/cms/clouds/manage)获取。详细获取方式请参考以下链接：
- **内容安全**（详见步骤四：策略配置）：[点击这里](https://cloud.tencent.com/document/product/1124/37119)
- **AI生成识别**（详见服务对接->方式二）：[点击这里](https://cloud.tencent.com/document/product/1124/118694)

示例值：TencentCloudDefault
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 该字段表示您为待检测文本分配的数据ID，作用是方便您对数据进行标识和管理。
取值：可由英文字母、数字、四种特殊符号（_，-，@，#）组成，**长度不超过64个字符**。
示例值：a6127dd-c2a0-43e7-a3da-d27022d39ba7 
     * @return DataId 该字段表示您为待检测文本分配的数据ID，作用是方便您对数据进行标识和管理。
取值：可由英文字母、数字、四种特殊符号（_，-，@，#）组成，**长度不超过64个字符**。
示例值：a6127dd-c2a0-43e7-a3da-d27022d39ba7
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 该字段表示您为待检测文本分配的数据ID，作用是方便您对数据进行标识和管理。
取值：可由英文字母、数字、四种特殊符号（_，-，@，#）组成，**长度不超过64个字符**。
示例值：a6127dd-c2a0-43e7-a3da-d27022d39ba7
     * @param DataId 该字段表示您为待检测文本分配的数据ID，作用是方便您对数据进行标识和管理。
取值：可由英文字母、数字、四种特殊符号（_，-，@，#）组成，**长度不超过64个字符**。
示例值：a6127dd-c2a0-43e7-a3da-d27022d39ba7
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。 
     * @return User 该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。
     */
    public User getUser() {
        return this.User;
    }

    /**
     * Set 该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。
     * @param User 该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。
     */
    public void setUser(User User) {
        this.User = User;
    }

    /**
     * Get 该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。 
     * @return Device 该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set 该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。
     * @param Device 该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。
     */
    public void setDevice(Device Device) {
        this.Device = Device;
    }

    /**
     * Get Content字段的原始语种，枚举值包括 zh 和 en：
- 推荐使用 zh
- en 适用于纯英文内容，耗时较高。若需使用 en，请先通过[反馈工单](https://console.cloud.tencent.com/workorder/category?level1_id=141&level2_id=1287&source=14&data_title=%E6%96%87%E6%9C%AC%E5%86%85%E5%AE%B9%E5%AE%89%E5%85%A8&step=1)确认

示例值：zh
 
     * @return SourceLanguage Content字段的原始语种，枚举值包括 zh 和 en：
- 推荐使用 zh
- en 适用于纯英文内容，耗时较高。若需使用 en，请先通过[反馈工单](https://console.cloud.tencent.com/workorder/category?level1_id=141&level2_id=1287&source=14&data_title=%E6%96%87%E6%9C%AC%E5%86%85%E5%AE%B9%E5%AE%89%E5%85%A8&step=1)确认

示例值：zh

     */
    public String getSourceLanguage() {
        return this.SourceLanguage;
    }

    /**
     * Set Content字段的原始语种，枚举值包括 zh 和 en：
- 推荐使用 zh
- en 适用于纯英文内容，耗时较高。若需使用 en，请先通过[反馈工单](https://console.cloud.tencent.com/workorder/category?level1_id=141&level2_id=1287&source=14&data_title=%E6%96%87%E6%9C%AC%E5%86%85%E5%AE%B9%E5%AE%89%E5%85%A8&step=1)确认

示例值：zh

     * @param SourceLanguage Content字段的原始语种，枚举值包括 zh 和 en：
- 推荐使用 zh
- en 适用于纯英文内容，耗时较高。若需使用 en，请先通过[反馈工单](https://console.cloud.tencent.com/workorder/category?level1_id=141&level2_id=1287&source=14&data_title=%E6%96%87%E6%9C%AC%E5%86%85%E5%AE%B9%E5%AE%89%E5%85%A8&step=1)确认

示例值：zh

     */
    public void setSourceLanguage(String SourceLanguage) {
        this.SourceLanguage = SourceLanguage;
    }

    /**
     * Get 服务类型，枚举值包括 TEXT 和 TEXT_AIGC：
TEXT：内容安全
TEXT_AIGC：AI生成识别 
     * @return Type 服务类型，枚举值包括 TEXT 和 TEXT_AIGC：
TEXT：内容安全
TEXT_AIGC：AI生成识别
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 服务类型，枚举值包括 TEXT 和 TEXT_AIGC：
TEXT：内容安全
TEXT_AIGC：AI生成识别
     * @param Type 服务类型，枚举值包括 TEXT 和 TEXT_AIGC：
TEXT：内容安全
TEXT_AIGC：AI生成识别
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 适用于上下文关联审核场景，若多条文本内容需要联合审核，通过该字段关联会话。
示例值：7e8f9a0b1c2d3e4f5a6b7c8d9e0f1a2b 
     * @return SessionId 适用于上下文关联审核场景，若多条文本内容需要联合审核，通过该字段关联会话。
示例值：7e8f9a0b1c2d3e4f5a6b7c8d9e0f1a2b
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 适用于上下文关联审核场景，若多条文本内容需要联合审核，通过该字段关联会话。
示例值：7e8f9a0b1c2d3e4f5a6b7c8d9e0f1a2b
     * @param SessionId 适用于上下文关联审核场景，若多条文本内容需要联合审核，通过该字段关联会话。
示例值：7e8f9a0b1c2d3e4f5a6b7c8d9e0f1a2b
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public TextModerationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextModerationRequest(TextModerationRequest source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.User != null) {
            this.User = new User(source.User);
        }
        if (source.Device != null) {
            this.Device = new Device(source.Device);
        }
        if (source.SourceLanguage != null) {
            this.SourceLanguage = new String(source.SourceLanguage);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamObj(map, prefix + "User.", this.User);
        this.setParamObj(map, prefix + "Device.", this.Device);
        this.setParamSimple(map, prefix + "SourceLanguage", this.SourceLanguage);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

