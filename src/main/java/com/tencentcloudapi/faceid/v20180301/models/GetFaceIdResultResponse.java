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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFaceIdResultResponse extends AbstractModel {

    /**
    * <p>身份证。</p>
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * <p>姓名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>业务核验结果。</p><ul><li>参考：https://cloud.tencent.com/document/product/1007/47912。</li></ul>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>业务核验描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>相似度。</p><ul><li>取值：0-100。</li><li>数值越大相似度越高。</li></ul>
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
    * <p>用户核验的视频base64。</p><ul><li>如果选择了使用cos，返回完整cos地址，如https://bucket.cos.ap-guangzhou.myqcloud.com/objectKey。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoBase64")
    @Expose
    private String VideoBase64;

    /**
    * <p>用户核验视频的截帧base64。</p><ul><li>如果选择了使用cos，返回完整cos地址如https://bucket.cos.ap-guangzhou.myqcloud.com/objectKey。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrameBase64")
    @Expose
    private String BestFrameBase64;

    /**
    * <p>获取token时透传的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>plus版：描述当前请求所在设备的风险标签。</p><ul><li>详情如下：<br>01-设备疑似被Root/设备疑似越狱。<br>02-设备疑似被注入。<br>03-设备疑似为模拟器。<br>04-设备疑似存在风险操作。<br>05-摄像头疑似被劫持。<br>06-疑似黑产设备。<br>null-无设备风险。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceInfoTag")
    @Expose
    private String DeviceInfoTag;

    /**
    * <p>行为风险标签。</p><ul><li>仅错误码返回1007（设备疑似被劫持）时返回风险标签。</li><li>标签说明：<br>02：攻击风险</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskInfoTag")
    @Expose
    private String RiskInfoTag;

    /**
    * <p>plus版：描述当前请求活体阶段被拒绝的详细原因。</p><ul><li>详情如下：<br>01-用户全程闭眼。<br>02-用户未完成指定动作。<br>03-疑似翻拍攻击。<br>04-疑似合成图片。<br>05-疑似合成视频。<br>06-疑似合成动作。<br>07-疑似黑产模板。<br>08-疑似存在水印。<br>09-反光校验未通过。<br>10-最佳帧校验未通过。<br>11-人脸质量过差。<br>12-人脸距离不匹配。<br>13-疑似对抗样本攻击。<br>null-无。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessInfoTag")
    @Expose
    private String LivenessInfoTag;

    /**
    * <p>plus版：描述当前请求所在设备的风险等级，共4级。</p><ul><li>详情如下：<br>1 - 安全。<br>2 - 低风险。<br>3 - 中风险。<br>4 - 高危。<br>null - 未获取到风险等级。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceInfoLevel")
    @Expose
    private String DeviceInfoLevel;

    /**
    * <p>敏感数据加密信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>加密后的数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
    * <p>用户核验的身份证人像页base64</p>
    */
    @SerializedName("IdCardFrontBase64")
    @Expose
    private String IdCardFrontBase64;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>身份证。</p> 
     * @return IdCard <p>身份证。</p>
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set <p>身份证。</p>
     * @param IdCard <p>身份证。</p>
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get <p>姓名。</p> 
     * @return Name <p>姓名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名。</p>
     * @param Name <p>姓名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>业务核验结果。</p><ul><li>参考：https://cloud.tencent.com/document/product/1007/47912。</li></ul> 
     * @return Result <p>业务核验结果。</p><ul><li>参考：https://cloud.tencent.com/document/product/1007/47912。</li></ul>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>业务核验结果。</p><ul><li>参考：https://cloud.tencent.com/document/product/1007/47912。</li></ul>
     * @param Result <p>业务核验结果。</p><ul><li>参考：https://cloud.tencent.com/document/product/1007/47912。</li></ul>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>业务核验描述。</p> 
     * @return Description <p>业务核验描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>业务核验描述。</p>
     * @param Description <p>业务核验描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>相似度。</p><ul><li>取值：0-100。</li><li>数值越大相似度越高。</li></ul> 
     * @return Similarity <p>相似度。</p><ul><li>取值：0-100。</li><li>数值越大相似度越高。</li></ul>
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set <p>相似度。</p><ul><li>取值：0-100。</li><li>数值越大相似度越高。</li></ul>
     * @param Similarity <p>相似度。</p><ul><li>取值：0-100。</li><li>数值越大相似度越高。</li></ul>
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * Get <p>用户核验的视频base64。</p><ul><li>如果选择了使用cos，返回完整cos地址，如https://bucket.cos.ap-guangzhou.myqcloud.com/objectKey。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoBase64 <p>用户核验的视频base64。</p><ul><li>如果选择了使用cos，返回完整cos地址，如https://bucket.cos.ap-guangzhou.myqcloud.com/objectKey。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoBase64() {
        return this.VideoBase64;
    }

    /**
     * Set <p>用户核验的视频base64。</p><ul><li>如果选择了使用cos，返回完整cos地址，如https://bucket.cos.ap-guangzhou.myqcloud.com/objectKey。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoBase64 <p>用户核验的视频base64。</p><ul><li>如果选择了使用cos，返回完整cos地址，如https://bucket.cos.ap-guangzhou.myqcloud.com/objectKey。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoBase64(String VideoBase64) {
        this.VideoBase64 = VideoBase64;
    }

    /**
     * Get <p>用户核验视频的截帧base64。</p><ul><li>如果选择了使用cos，返回完整cos地址如https://bucket.cos.ap-guangzhou.myqcloud.com/objectKey。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrameBase64 <p>用户核验视频的截帧base64。</p><ul><li>如果选择了使用cos，返回完整cos地址如https://bucket.cos.ap-guangzhou.myqcloud.com/objectKey。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBestFrameBase64() {
        return this.BestFrameBase64;
    }

    /**
     * Set <p>用户核验视频的截帧base64。</p><ul><li>如果选择了使用cos，返回完整cos地址如https://bucket.cos.ap-guangzhou.myqcloud.com/objectKey。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrameBase64 <p>用户核验视频的截帧base64。</p><ul><li>如果选择了使用cos，返回完整cos地址如https://bucket.cos.ap-guangzhou.myqcloud.com/objectKey。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrameBase64(String BestFrameBase64) {
        this.BestFrameBase64 = BestFrameBase64;
    }

    /**
     * Get <p>获取token时透传的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra <p>获取token时透传的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>获取token时透传的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra <p>获取token时透传的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>plus版：描述当前请求所在设备的风险标签。</p><ul><li>详情如下：<br>01-设备疑似被Root/设备疑似越狱。<br>02-设备疑似被注入。<br>03-设备疑似为模拟器。<br>04-设备疑似存在风险操作。<br>05-摄像头疑似被劫持。<br>06-疑似黑产设备。<br>null-无设备风险。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceInfoTag <p>plus版：描述当前请求所在设备的风险标签。</p><ul><li>详情如下：<br>01-设备疑似被Root/设备疑似越狱。<br>02-设备疑似被注入。<br>03-设备疑似为模拟器。<br>04-设备疑似存在风险操作。<br>05-摄像头疑似被劫持。<br>06-疑似黑产设备。<br>null-无设备风险。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceInfoTag() {
        return this.DeviceInfoTag;
    }

    /**
     * Set <p>plus版：描述当前请求所在设备的风险标签。</p><ul><li>详情如下：<br>01-设备疑似被Root/设备疑似越狱。<br>02-设备疑似被注入。<br>03-设备疑似为模拟器。<br>04-设备疑似存在风险操作。<br>05-摄像头疑似被劫持。<br>06-疑似黑产设备。<br>null-无设备风险。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceInfoTag <p>plus版：描述当前请求所在设备的风险标签。</p><ul><li>详情如下：<br>01-设备疑似被Root/设备疑似越狱。<br>02-设备疑似被注入。<br>03-设备疑似为模拟器。<br>04-设备疑似存在风险操作。<br>05-摄像头疑似被劫持。<br>06-疑似黑产设备。<br>null-无设备风险。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceInfoTag(String DeviceInfoTag) {
        this.DeviceInfoTag = DeviceInfoTag;
    }

    /**
     * Get <p>行为风险标签。</p><ul><li>仅错误码返回1007（设备疑似被劫持）时返回风险标签。</li><li>标签说明：<br>02：攻击风险</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskInfoTag <p>行为风险标签。</p><ul><li>仅错误码返回1007（设备疑似被劫持）时返回风险标签。</li><li>标签说明：<br>02：攻击风险</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskInfoTag() {
        return this.RiskInfoTag;
    }

    /**
     * Set <p>行为风险标签。</p><ul><li>仅错误码返回1007（设备疑似被劫持）时返回风险标签。</li><li>标签说明：<br>02：攻击风险</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskInfoTag <p>行为风险标签。</p><ul><li>仅错误码返回1007（设备疑似被劫持）时返回风险标签。</li><li>标签说明：<br>02：攻击风险</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskInfoTag(String RiskInfoTag) {
        this.RiskInfoTag = RiskInfoTag;
    }

    /**
     * Get <p>plus版：描述当前请求活体阶段被拒绝的详细原因。</p><ul><li>详情如下：<br>01-用户全程闭眼。<br>02-用户未完成指定动作。<br>03-疑似翻拍攻击。<br>04-疑似合成图片。<br>05-疑似合成视频。<br>06-疑似合成动作。<br>07-疑似黑产模板。<br>08-疑似存在水印。<br>09-反光校验未通过。<br>10-最佳帧校验未通过。<br>11-人脸质量过差。<br>12-人脸距离不匹配。<br>13-疑似对抗样本攻击。<br>null-无。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessInfoTag <p>plus版：描述当前请求活体阶段被拒绝的详细原因。</p><ul><li>详情如下：<br>01-用户全程闭眼。<br>02-用户未完成指定动作。<br>03-疑似翻拍攻击。<br>04-疑似合成图片。<br>05-疑似合成视频。<br>06-疑似合成动作。<br>07-疑似黑产模板。<br>08-疑似存在水印。<br>09-反光校验未通过。<br>10-最佳帧校验未通过。<br>11-人脸质量过差。<br>12-人脸距离不匹配。<br>13-疑似对抗样本攻击。<br>null-无。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLivenessInfoTag() {
        return this.LivenessInfoTag;
    }

    /**
     * Set <p>plus版：描述当前请求活体阶段被拒绝的详细原因。</p><ul><li>详情如下：<br>01-用户全程闭眼。<br>02-用户未完成指定动作。<br>03-疑似翻拍攻击。<br>04-疑似合成图片。<br>05-疑似合成视频。<br>06-疑似合成动作。<br>07-疑似黑产模板。<br>08-疑似存在水印。<br>09-反光校验未通过。<br>10-最佳帧校验未通过。<br>11-人脸质量过差。<br>12-人脸距离不匹配。<br>13-疑似对抗样本攻击。<br>null-无。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessInfoTag <p>plus版：描述当前请求活体阶段被拒绝的详细原因。</p><ul><li>详情如下：<br>01-用户全程闭眼。<br>02-用户未完成指定动作。<br>03-疑似翻拍攻击。<br>04-疑似合成图片。<br>05-疑似合成视频。<br>06-疑似合成动作。<br>07-疑似黑产模板。<br>08-疑似存在水印。<br>09-反光校验未通过。<br>10-最佳帧校验未通过。<br>11-人脸质量过差。<br>12-人脸距离不匹配。<br>13-疑似对抗样本攻击。<br>null-无。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessInfoTag(String LivenessInfoTag) {
        this.LivenessInfoTag = LivenessInfoTag;
    }

    /**
     * Get <p>plus版：描述当前请求所在设备的风险等级，共4级。</p><ul><li>详情如下：<br>1 - 安全。<br>2 - 低风险。<br>3 - 中风险。<br>4 - 高危。<br>null - 未获取到风险等级。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceInfoLevel <p>plus版：描述当前请求所在设备的风险等级，共4级。</p><ul><li>详情如下：<br>1 - 安全。<br>2 - 低风险。<br>3 - 中风险。<br>4 - 高危。<br>null - 未获取到风险等级。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceInfoLevel() {
        return this.DeviceInfoLevel;
    }

    /**
     * Set <p>plus版：描述当前请求所在设备的风险等级，共4级。</p><ul><li>详情如下：<br>1 - 安全。<br>2 - 低风险。<br>3 - 中风险。<br>4 - 高危。<br>null - 未获取到风险等级。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceInfoLevel <p>plus版：描述当前请求所在设备的风险等级，共4级。</p><ul><li>详情如下：<br>1 - 安全。<br>2 - 低风险。<br>3 - 中风险。<br>4 - 高危。<br>null - 未获取到风险等级。</li><li>增强版：此字段不生效，默认为null。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceInfoLevel(String DeviceInfoLevel) {
        this.DeviceInfoLevel = DeviceInfoLevel;
    }

    /**
     * Get <p>敏感数据加密信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encryption <p>敏感数据加密信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>敏感数据加密信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encryption <p>敏感数据加密信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>加密后的数据。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptedBody <p>加密后的数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set <p>加密后的数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptedBody <p>加密后的数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
    }

    /**
     * Get <p>用户核验的身份证人像页base64</p> 
     * @return IdCardFrontBase64 <p>用户核验的身份证人像页base64</p>
     */
    public String getIdCardFrontBase64() {
        return this.IdCardFrontBase64;
    }

    /**
     * Set <p>用户核验的身份证人像页base64</p>
     * @param IdCardFrontBase64 <p>用户核验的身份证人像页base64</p>
     */
    public void setIdCardFrontBase64(String IdCardFrontBase64) {
        this.IdCardFrontBase64 = IdCardFrontBase64;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetFaceIdResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFaceIdResultResponse(GetFaceIdResultResponse source) {
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Similarity != null) {
            this.Similarity = new Float(source.Similarity);
        }
        if (source.VideoBase64 != null) {
            this.VideoBase64 = new String(source.VideoBase64);
        }
        if (source.BestFrameBase64 != null) {
            this.BestFrameBase64 = new String(source.BestFrameBase64);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.DeviceInfoTag != null) {
            this.DeviceInfoTag = new String(source.DeviceInfoTag);
        }
        if (source.RiskInfoTag != null) {
            this.RiskInfoTag = new String(source.RiskInfoTag);
        }
        if (source.LivenessInfoTag != null) {
            this.LivenessInfoTag = new String(source.LivenessInfoTag);
        }
        if (source.DeviceInfoLevel != null) {
            this.DeviceInfoLevel = new String(source.DeviceInfoLevel);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.EncryptedBody != null) {
            this.EncryptedBody = new String(source.EncryptedBody);
        }
        if (source.IdCardFrontBase64 != null) {
            this.IdCardFrontBase64 = new String(source.IdCardFrontBase64);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);
        this.setParamSimple(map, prefix + "VideoBase64", this.VideoBase64);
        this.setParamSimple(map, prefix + "BestFrameBase64", this.BestFrameBase64);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "DeviceInfoTag", this.DeviceInfoTag);
        this.setParamSimple(map, prefix + "RiskInfoTag", this.RiskInfoTag);
        this.setParamSimple(map, prefix + "LivenessInfoTag", this.LivenessInfoTag);
        this.setParamSimple(map, prefix + "DeviceInfoLevel", this.DeviceInfoLevel);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);
        this.setParamSimple(map, prefix + "IdCardFrontBase64", this.IdCardFrontBase64);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

