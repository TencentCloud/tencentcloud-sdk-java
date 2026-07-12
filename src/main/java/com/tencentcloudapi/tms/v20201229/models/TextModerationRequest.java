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
    * <p>待检测的文本内容，需为UTF-8编码并以Base64格式传入。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>接口使用的识别策略编号，需在<a href="https://console.cloud.tencent.com/cms/clouds/manage">控制台</a>获取。详细获取方式请参考以下链接：</p><ul><li><strong>内容安全</strong>（详见步骤四：策略配置）：<a href="https://cloud.tencent.com/document/product/1124/37119">点击这里</a></li><li><strong>AI生成识别</strong>（详见服务对接-&gt;方式二）：<a href="https://cloud.tencent.com/document/product/1124/118694">点击这里</a></li></ul>
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * <p>该字段表示您为待检测文本分配的数据ID，作用是方便您对数据进行标识和管理。<br>取值：可由英文字母、数字、四种特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * <p>该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。</p>
    */
    @SerializedName("User")
    @Expose
    private User User;

    /**
    * <p>该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。</p>
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
    * <p>Content字段的原始语种，枚举值包括 zh 和 en：</p><ul><li>推荐使用 zh</li><li>en 适用于纯英文内容，耗时较高。若需使用 en，请先通过<a href="https://console.cloud.tencent.com/workorder/category?level1_id=141&amp;level2_id=1287&amp;source=14&amp;data_title=%E6%96%87%E6%9C%AC%E5%86%85%E5%AE%B9%E5%AE%89%E5%85%A8&amp;step=1">反馈工单</a>确认</li></ul>
    */
    @SerializedName("SourceLanguage")
    @Expose
    private String SourceLanguage;

    /**
    * <p>服务类型，枚举值包括 TEXT 和 TEXT_AIGC：<br>TEXT：内容安全<br>TEXT_AIGC：AI生成识别</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>适用于上下文关联审核场景，若多条文本内容需要联合审核，通过该字段关联会话。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get <p>待检测的文本内容，需为UTF-8编码并以Base64格式传入。</p> 
     * @return Content <p>待检测的文本内容，需为UTF-8编码并以Base64格式传入。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>待检测的文本内容，需为UTF-8编码并以Base64格式传入。</p>
     * @param Content <p>待检测的文本内容，需为UTF-8编码并以Base64格式传入。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>接口使用的识别策略编号，需在<a href="https://console.cloud.tencent.com/cms/clouds/manage">控制台</a>获取。详细获取方式请参考以下链接：</p><ul><li><strong>内容安全</strong>（详见步骤四：策略配置）：<a href="https://cloud.tencent.com/document/product/1124/37119">点击这里</a></li><li><strong>AI生成识别</strong>（详见服务对接-&gt;方式二）：<a href="https://cloud.tencent.com/document/product/1124/118694">点击这里</a></li></ul> 
     * @return BizType <p>接口使用的识别策略编号，需在<a href="https://console.cloud.tencent.com/cms/clouds/manage">控制台</a>获取。详细获取方式请参考以下链接：</p><ul><li><strong>内容安全</strong>（详见步骤四：策略配置）：<a href="https://cloud.tencent.com/document/product/1124/37119">点击这里</a></li><li><strong>AI生成识别</strong>（详见服务对接-&gt;方式二）：<a href="https://cloud.tencent.com/document/product/1124/118694">点击这里</a></li></ul>
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>接口使用的识别策略编号，需在<a href="https://console.cloud.tencent.com/cms/clouds/manage">控制台</a>获取。详细获取方式请参考以下链接：</p><ul><li><strong>内容安全</strong>（详见步骤四：策略配置）：<a href="https://cloud.tencent.com/document/product/1124/37119">点击这里</a></li><li><strong>AI生成识别</strong>（详见服务对接-&gt;方式二）：<a href="https://cloud.tencent.com/document/product/1124/118694">点击这里</a></li></ul>
     * @param BizType <p>接口使用的识别策略编号，需在<a href="https://console.cloud.tencent.com/cms/clouds/manage">控制台</a>获取。详细获取方式请参考以下链接：</p><ul><li><strong>内容安全</strong>（详见步骤四：策略配置）：<a href="https://cloud.tencent.com/document/product/1124/37119">点击这里</a></li><li><strong>AI生成识别</strong>（详见服务对接-&gt;方式二）：<a href="https://cloud.tencent.com/document/product/1124/118694">点击这里</a></li></ul>
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>该字段表示您为待检测文本分配的数据ID，作用是方便您对数据进行标识和管理。<br>取值：可由英文字母、数字、四种特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p> 
     * @return DataId <p>该字段表示您为待检测文本分配的数据ID，作用是方便您对数据进行标识和管理。<br>取值：可由英文字母、数字、四种特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set <p>该字段表示您为待检测文本分配的数据ID，作用是方便您对数据进行标识和管理。<br>取值：可由英文字母、数字、四种特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
     * @param DataId <p>该字段表示您为待检测文本分配的数据ID，作用是方便您对数据进行标识和管理。<br>取值：可由英文字母、数字、四种特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get <p>该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。</p> 
     * @return User <p>该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。</p>
     */
    public User getUser() {
        return this.User;
    }

    /**
     * Set <p>该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。</p>
     * @param User <p>该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。</p>
     */
    public void setUser(User User) {
        this.User = User;
    }

    /**
     * Get <p>该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。</p> 
     * @return Device <p>该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。</p>
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set <p>该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。</p>
     * @param Device <p>该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。</p>
     */
    public void setDevice(Device Device) {
        this.Device = Device;
    }

    /**
     * Get <p>Content字段的原始语种，枚举值包括 zh 和 en：</p><ul><li>推荐使用 zh</li><li>en 适用于纯英文内容，耗时较高。若需使用 en，请先通过<a href="https://console.cloud.tencent.com/workorder/category?level1_id=141&amp;level2_id=1287&amp;source=14&amp;data_title=%E6%96%87%E6%9C%AC%E5%86%85%E5%AE%B9%E5%AE%89%E5%85%A8&amp;step=1">反馈工单</a>确认</li></ul> 
     * @return SourceLanguage <p>Content字段的原始语种，枚举值包括 zh 和 en：</p><ul><li>推荐使用 zh</li><li>en 适用于纯英文内容，耗时较高。若需使用 en，请先通过<a href="https://console.cloud.tencent.com/workorder/category?level1_id=141&amp;level2_id=1287&amp;source=14&amp;data_title=%E6%96%87%E6%9C%AC%E5%86%85%E5%AE%B9%E5%AE%89%E5%85%A8&amp;step=1">反馈工单</a>确认</li></ul>
     */
    public String getSourceLanguage() {
        return this.SourceLanguage;
    }

    /**
     * Set <p>Content字段的原始语种，枚举值包括 zh 和 en：</p><ul><li>推荐使用 zh</li><li>en 适用于纯英文内容，耗时较高。若需使用 en，请先通过<a href="https://console.cloud.tencent.com/workorder/category?level1_id=141&amp;level2_id=1287&amp;source=14&amp;data_title=%E6%96%87%E6%9C%AC%E5%86%85%E5%AE%B9%E5%AE%89%E5%85%A8&amp;step=1">反馈工单</a>确认</li></ul>
     * @param SourceLanguage <p>Content字段的原始语种，枚举值包括 zh 和 en：</p><ul><li>推荐使用 zh</li><li>en 适用于纯英文内容，耗时较高。若需使用 en，请先通过<a href="https://console.cloud.tencent.com/workorder/category?level1_id=141&amp;level2_id=1287&amp;source=14&amp;data_title=%E6%96%87%E6%9C%AC%E5%86%85%E5%AE%B9%E5%AE%89%E5%85%A8&amp;step=1">反馈工单</a>确认</li></ul>
     */
    public void setSourceLanguage(String SourceLanguage) {
        this.SourceLanguage = SourceLanguage;
    }

    /**
     * Get <p>服务类型，枚举值包括 TEXT 和 TEXT_AIGC：<br>TEXT：内容安全<br>TEXT_AIGC：AI生成识别</p> 
     * @return Type <p>服务类型，枚举值包括 TEXT 和 TEXT_AIGC：<br>TEXT：内容安全<br>TEXT_AIGC：AI生成识别</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>服务类型，枚举值包括 TEXT 和 TEXT_AIGC：<br>TEXT：内容安全<br>TEXT_AIGC：AI生成识别</p>
     * @param Type <p>服务类型，枚举值包括 TEXT 和 TEXT_AIGC：<br>TEXT：内容安全<br>TEXT_AIGC：AI生成识别</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>适用于上下文关联审核场景，若多条文本内容需要联合审核，通过该字段关联会话。</p> 
     * @return SessionId <p>适用于上下文关联审核场景，若多条文本内容需要联合审核，通过该字段关联会话。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>适用于上下文关联审核场景，若多条文本内容需要联合审核，通过该字段关联会话。</p>
     * @param SessionId <p>适用于上下文关联审核场景，若多条文本内容需要联合审核，通过该字段关联会话。</p>
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

