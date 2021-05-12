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
package com.tencentcloudapi.hcm.v20181106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EvaluationRequest extends AbstractModel{

    /**
    * 图片唯一标识，一张图片一个SessionId；
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 图片数据，需要使用base64对图片的二进制数据进行编码，与url参数二者填一即可；
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 HcmAppid 可以在[控制台](https://console.cloud.tencent.com/hcm)【应用管理】下新建。
    */
    @SerializedName("HcmAppid")
    @Expose
    private String HcmAppid;

    /**
    * 图片url，与Image参数二者填一即可；
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 横屏拍摄开关，若开启则支持传输横屏拍摄的图片；
    */
    @SerializedName("SupportHorizontalImage")
    @Expose
    private Boolean SupportHorizontalImage;

    /**
    * 拒绝非速算图（如风景图、人物图）开关，若开启，则遇到非速算图会快速返回拒绝的结果，但极端情况下可能会影响评估结果（比如算式截图贴到风景画里可能被判为非速算图直接返回了）。
    */
    @SerializedName("RejectNonArithmeticImage")
    @Expose
    private Boolean RejectNonArithmeticImage;

    /**
    * 异步模式标识，0：同步模式，1：异步模式。默认为同步模式
    */
    @SerializedName("IsAsync")
    @Expose
    private Long IsAsync;

    /**
    * 是否展开耦合算式中的竖式计算
    */
    @SerializedName("EnableDispRelatedVertical")
    @Expose
    private Boolean EnableDispRelatedVertical;

    /**
    * 是否展示竖式算式的中间结果和格式控制字符
    */
    @SerializedName("EnableDispMidresult")
    @Expose
    private Boolean EnableDispMidresult;

    /**
    * 是否开启pdf识别，默认开启
    */
    @SerializedName("EnablePdfRecognize")
    @Expose
    private Boolean EnablePdfRecognize;

    /**
    * pdf页码，从0开始，默认为0
    */
    @SerializedName("PdfPageIndex")
    @Expose
    private Long PdfPageIndex;

    /**
    * 是否返回LaTex，默认为0返回普通格式，设置成1返回LaTex格式
    */
    @SerializedName("LaTex")
    @Expose
    private Long LaTex;

    /**
    * 用于选择是否拒绝模糊题 目。打开则丢弃模糊题目， 不进行后续的判题返回结 果。
    */
    @SerializedName("RejectVagueArithmetic")
    @Expose
    private Boolean RejectVagueArithmetic;

    /**
     * Get 图片唯一标识，一张图片一个SessionId； 
     * @return SessionId 图片唯一标识，一张图片一个SessionId；
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 图片唯一标识，一张图片一个SessionId；
     * @param SessionId 图片唯一标识，一张图片一个SessionId；
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 图片数据，需要使用base64对图片的二进制数据进行编码，与url参数二者填一即可； 
     * @return Image 图片数据，需要使用base64对图片的二进制数据进行编码，与url参数二者填一即可；
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片数据，需要使用base64对图片的二进制数据进行编码，与url参数二者填一即可；
     * @param Image 图片数据，需要使用base64对图片的二进制数据进行编码，与url参数二者填一即可；
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 HcmAppid 可以在[控制台](https://console.cloud.tencent.com/hcm)【应用管理】下新建。 
     * @return HcmAppid 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 HcmAppid 可以在[控制台](https://console.cloud.tencent.com/hcm)【应用管理】下新建。
     */
    public String getHcmAppid() {
        return this.HcmAppid;
    }

    /**
     * Set 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 HcmAppid 可以在[控制台](https://console.cloud.tencent.com/hcm)【应用管理】下新建。
     * @param HcmAppid 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 HcmAppid 可以在[控制台](https://console.cloud.tencent.com/hcm)【应用管理】下新建。
     */
    public void setHcmAppid(String HcmAppid) {
        this.HcmAppid = HcmAppid;
    }

    /**
     * Get 图片url，与Image参数二者填一即可； 
     * @return Url 图片url，与Image参数二者填一即可；
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片url，与Image参数二者填一即可；
     * @param Url 图片url，与Image参数二者填一即可；
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 横屏拍摄开关，若开启则支持传输横屏拍摄的图片； 
     * @return SupportHorizontalImage 横屏拍摄开关，若开启则支持传输横屏拍摄的图片；
     */
    public Boolean getSupportHorizontalImage() {
        return this.SupportHorizontalImage;
    }

    /**
     * Set 横屏拍摄开关，若开启则支持传输横屏拍摄的图片；
     * @param SupportHorizontalImage 横屏拍摄开关，若开启则支持传输横屏拍摄的图片；
     */
    public void setSupportHorizontalImage(Boolean SupportHorizontalImage) {
        this.SupportHorizontalImage = SupportHorizontalImage;
    }

    /**
     * Get 拒绝非速算图（如风景图、人物图）开关，若开启，则遇到非速算图会快速返回拒绝的结果，但极端情况下可能会影响评估结果（比如算式截图贴到风景画里可能被判为非速算图直接返回了）。 
     * @return RejectNonArithmeticImage 拒绝非速算图（如风景图、人物图）开关，若开启，则遇到非速算图会快速返回拒绝的结果，但极端情况下可能会影响评估结果（比如算式截图贴到风景画里可能被判为非速算图直接返回了）。
     */
    public Boolean getRejectNonArithmeticImage() {
        return this.RejectNonArithmeticImage;
    }

    /**
     * Set 拒绝非速算图（如风景图、人物图）开关，若开启，则遇到非速算图会快速返回拒绝的结果，但极端情况下可能会影响评估结果（比如算式截图贴到风景画里可能被判为非速算图直接返回了）。
     * @param RejectNonArithmeticImage 拒绝非速算图（如风景图、人物图）开关，若开启，则遇到非速算图会快速返回拒绝的结果，但极端情况下可能会影响评估结果（比如算式截图贴到风景画里可能被判为非速算图直接返回了）。
     */
    public void setRejectNonArithmeticImage(Boolean RejectNonArithmeticImage) {
        this.RejectNonArithmeticImage = RejectNonArithmeticImage;
    }

    /**
     * Get 异步模式标识，0：同步模式，1：异步模式。默认为同步模式 
     * @return IsAsync 异步模式标识，0：同步模式，1：异步模式。默认为同步模式
     */
    public Long getIsAsync() {
        return this.IsAsync;
    }

    /**
     * Set 异步模式标识，0：同步模式，1：异步模式。默认为同步模式
     * @param IsAsync 异步模式标识，0：同步模式，1：异步模式。默认为同步模式
     */
    public void setIsAsync(Long IsAsync) {
        this.IsAsync = IsAsync;
    }

    /**
     * Get 是否展开耦合算式中的竖式计算 
     * @return EnableDispRelatedVertical 是否展开耦合算式中的竖式计算
     */
    public Boolean getEnableDispRelatedVertical() {
        return this.EnableDispRelatedVertical;
    }

    /**
     * Set 是否展开耦合算式中的竖式计算
     * @param EnableDispRelatedVertical 是否展开耦合算式中的竖式计算
     */
    public void setEnableDispRelatedVertical(Boolean EnableDispRelatedVertical) {
        this.EnableDispRelatedVertical = EnableDispRelatedVertical;
    }

    /**
     * Get 是否展示竖式算式的中间结果和格式控制字符 
     * @return EnableDispMidresult 是否展示竖式算式的中间结果和格式控制字符
     */
    public Boolean getEnableDispMidresult() {
        return this.EnableDispMidresult;
    }

    /**
     * Set 是否展示竖式算式的中间结果和格式控制字符
     * @param EnableDispMidresult 是否展示竖式算式的中间结果和格式控制字符
     */
    public void setEnableDispMidresult(Boolean EnableDispMidresult) {
        this.EnableDispMidresult = EnableDispMidresult;
    }

    /**
     * Get 是否开启pdf识别，默认开启 
     * @return EnablePdfRecognize 是否开启pdf识别，默认开启
     */
    public Boolean getEnablePdfRecognize() {
        return this.EnablePdfRecognize;
    }

    /**
     * Set 是否开启pdf识别，默认开启
     * @param EnablePdfRecognize 是否开启pdf识别，默认开启
     */
    public void setEnablePdfRecognize(Boolean EnablePdfRecognize) {
        this.EnablePdfRecognize = EnablePdfRecognize;
    }

    /**
     * Get pdf页码，从0开始，默认为0 
     * @return PdfPageIndex pdf页码，从0开始，默认为0
     */
    public Long getPdfPageIndex() {
        return this.PdfPageIndex;
    }

    /**
     * Set pdf页码，从0开始，默认为0
     * @param PdfPageIndex pdf页码，从0开始，默认为0
     */
    public void setPdfPageIndex(Long PdfPageIndex) {
        this.PdfPageIndex = PdfPageIndex;
    }

    /**
     * Get 是否返回LaTex，默认为0返回普通格式，设置成1返回LaTex格式 
     * @return LaTex 是否返回LaTex，默认为0返回普通格式，设置成1返回LaTex格式
     */
    public Long getLaTex() {
        return this.LaTex;
    }

    /**
     * Set 是否返回LaTex，默认为0返回普通格式，设置成1返回LaTex格式
     * @param LaTex 是否返回LaTex，默认为0返回普通格式，设置成1返回LaTex格式
     */
    public void setLaTex(Long LaTex) {
        this.LaTex = LaTex;
    }

    /**
     * Get 用于选择是否拒绝模糊题 目。打开则丢弃模糊题目， 不进行后续的判题返回结 果。 
     * @return RejectVagueArithmetic 用于选择是否拒绝模糊题 目。打开则丢弃模糊题目， 不进行后续的判题返回结 果。
     */
    public Boolean getRejectVagueArithmetic() {
        return this.RejectVagueArithmetic;
    }

    /**
     * Set 用于选择是否拒绝模糊题 目。打开则丢弃模糊题目， 不进行后续的判题返回结 果。
     * @param RejectVagueArithmetic 用于选择是否拒绝模糊题 目。打开则丢弃模糊题目， 不进行后续的判题返回结 果。
     */
    public void setRejectVagueArithmetic(Boolean RejectVagueArithmetic) {
        this.RejectVagueArithmetic = RejectVagueArithmetic;
    }

    public EvaluationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvaluationRequest(EvaluationRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.HcmAppid != null) {
            this.HcmAppid = new String(source.HcmAppid);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.SupportHorizontalImage != null) {
            this.SupportHorizontalImage = new Boolean(source.SupportHorizontalImage);
        }
        if (source.RejectNonArithmeticImage != null) {
            this.RejectNonArithmeticImage = new Boolean(source.RejectNonArithmeticImage);
        }
        if (source.IsAsync != null) {
            this.IsAsync = new Long(source.IsAsync);
        }
        if (source.EnableDispRelatedVertical != null) {
            this.EnableDispRelatedVertical = new Boolean(source.EnableDispRelatedVertical);
        }
        if (source.EnableDispMidresult != null) {
            this.EnableDispMidresult = new Boolean(source.EnableDispMidresult);
        }
        if (source.EnablePdfRecognize != null) {
            this.EnablePdfRecognize = new Boolean(source.EnablePdfRecognize);
        }
        if (source.PdfPageIndex != null) {
            this.PdfPageIndex = new Long(source.PdfPageIndex);
        }
        if (source.LaTex != null) {
            this.LaTex = new Long(source.LaTex);
        }
        if (source.RejectVagueArithmetic != null) {
            this.RejectVagueArithmetic = new Boolean(source.RejectVagueArithmetic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "HcmAppid", this.HcmAppid);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "SupportHorizontalImage", this.SupportHorizontalImage);
        this.setParamSimple(map, prefix + "RejectNonArithmeticImage", this.RejectNonArithmeticImage);
        this.setParamSimple(map, prefix + "IsAsync", this.IsAsync);
        this.setParamSimple(map, prefix + "EnableDispRelatedVertical", this.EnableDispRelatedVertical);
        this.setParamSimple(map, prefix + "EnableDispMidresult", this.EnableDispMidresult);
        this.setParamSimple(map, prefix + "EnablePdfRecognize", this.EnablePdfRecognize);
        this.setParamSimple(map, prefix + "PdfPageIndex", this.PdfPageIndex);
        this.setParamSimple(map, prefix + "LaTex", this.LaTex);
        this.setParamSimple(map, prefix + "RejectVagueArithmetic", this.RejectVagueArithmetic);

    }
}

