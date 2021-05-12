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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextData extends AbstractModel{

    /**
    * 是否恶意 0：正常 1：可疑
    */
    @SerializedName("EvilFlag")
    @Expose
    private Long EvilFlag;

    /**
    * 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂
20105：广告引流 
24001：暴恐
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 消息类公共相关参数
    */
    @SerializedName("Common")
    @Expose
    private TextOutputComm Common;

    /**
    * 返回的自定义词库结果
    */
    @SerializedName("CustomResult")
    @Expose
    private CustomResult [] CustomResult;

    /**
    * 返回的详细结果
    */
    @SerializedName("DetailResult")
    @Expose
    private DetailResult [] DetailResult;

    /**
    * 消息类ID信息
    */
    @SerializedName("ID")
    @Expose
    private TextOutputID ID;

    /**
    * 消息类输出结果
    */
    @SerializedName("Res")
    @Expose
    private TextOutputRes Res;

    /**
    * 账号风险检测结果
    */
    @SerializedName("RiskDetails")
    @Expose
    private RiskDetails [] RiskDetails;

    /**
    * 最终使用的BizType
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * 和请求中的DataId一致，原样返回
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义关键词
    */
    @SerializedName("EvilLabel")
    @Expose
    private String EvilLabel;

    /**
    * 输出的其他信息，不同客户内容不同
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 命中的关键词
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 命中的模型分值
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 建议值,Block：打击,Review：待复审,Normal：正常
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
     * Get 是否恶意 0：正常 1：可疑 
     * @return EvilFlag 是否恶意 0：正常 1：可疑
     */
    public Long getEvilFlag() {
        return this.EvilFlag;
    }

    /**
     * Set 是否恶意 0：正常 1：可疑
     * @param EvilFlag 是否恶意 0：正常 1：可疑
     */
    public void setEvilFlag(Long EvilFlag) {
        this.EvilFlag = EvilFlag;
    }

    /**
     * Get 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂
20105：广告引流 
24001：暴恐 
     * @return EvilType 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂
20105：广告引流 
24001：暴恐
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂
20105：广告引流 
24001：暴恐
     * @param EvilType 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂
20105：广告引流 
24001：暴恐
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 消息类公共相关参数 
     * @return Common 消息类公共相关参数
     */
    public TextOutputComm getCommon() {
        return this.Common;
    }

    /**
     * Set 消息类公共相关参数
     * @param Common 消息类公共相关参数
     */
    public void setCommon(TextOutputComm Common) {
        this.Common = Common;
    }

    /**
     * Get 返回的自定义词库结果 
     * @return CustomResult 返回的自定义词库结果
     */
    public CustomResult [] getCustomResult() {
        return this.CustomResult;
    }

    /**
     * Set 返回的自定义词库结果
     * @param CustomResult 返回的自定义词库结果
     */
    public void setCustomResult(CustomResult [] CustomResult) {
        this.CustomResult = CustomResult;
    }

    /**
     * Get 返回的详细结果 
     * @return DetailResult 返回的详细结果
     */
    public DetailResult [] getDetailResult() {
        return this.DetailResult;
    }

    /**
     * Set 返回的详细结果
     * @param DetailResult 返回的详细结果
     */
    public void setDetailResult(DetailResult [] DetailResult) {
        this.DetailResult = DetailResult;
    }

    /**
     * Get 消息类ID信息 
     * @return ID 消息类ID信息
     */
    public TextOutputID getID() {
        return this.ID;
    }

    /**
     * Set 消息类ID信息
     * @param ID 消息类ID信息
     */
    public void setID(TextOutputID ID) {
        this.ID = ID;
    }

    /**
     * Get 消息类输出结果 
     * @return Res 消息类输出结果
     */
    public TextOutputRes getRes() {
        return this.Res;
    }

    /**
     * Set 消息类输出结果
     * @param Res 消息类输出结果
     */
    public void setRes(TextOutputRes Res) {
        this.Res = Res;
    }

    /**
     * Get 账号风险检测结果 
     * @return RiskDetails 账号风险检测结果
     */
    public RiskDetails [] getRiskDetails() {
        return this.RiskDetails;
    }

    /**
     * Set 账号风险检测结果
     * @param RiskDetails 账号风险检测结果
     */
    public void setRiskDetails(RiskDetails [] RiskDetails) {
        this.RiskDetails = RiskDetails;
    }

    /**
     * Get 最终使用的BizType 
     * @return BizType 最终使用的BizType
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set 最终使用的BizType
     * @param BizType 最终使用的BizType
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 和请求中的DataId一致，原样返回 
     * @return DataId 和请求中的DataId一致，原样返回
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 和请求中的DataId一致，原样返回
     * @param DataId 和请求中的DataId一致，原样返回
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义关键词 
     * @return EvilLabel 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义关键词
     */
    public String getEvilLabel() {
        return this.EvilLabel;
    }

    /**
     * Set 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义关键词
     * @param EvilLabel 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义关键词
     */
    public void setEvilLabel(String EvilLabel) {
        this.EvilLabel = EvilLabel;
    }

    /**
     * Get 输出的其他信息，不同客户内容不同 
     * @return Extra 输出的其他信息，不同客户内容不同
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 输出的其他信息，不同客户内容不同
     * @param Extra 输出的其他信息，不同客户内容不同
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 命中的关键词 
     * @return Keywords 命中的关键词
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 命中的关键词
     * @param Keywords 命中的关键词
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 命中的模型分值 
     * @return Score 命中的模型分值
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 命中的模型分值
     * @param Score 命中的模型分值
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 建议值,Block：打击,Review：待复审,Normal：正常 
     * @return Suggestion 建议值,Block：打击,Review：待复审,Normal：正常
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议值,Block：打击,Review：待复审,Normal：正常
     * @param Suggestion 建议值,Block：打击,Review：待复审,Normal：正常
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    public TextData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextData(TextData source) {
        if (source.EvilFlag != null) {
            this.EvilFlag = new Long(source.EvilFlag);
        }
        if (source.EvilType != null) {
            this.EvilType = new Long(source.EvilType);
        }
        if (source.Common != null) {
            this.Common = new TextOutputComm(source.Common);
        }
        if (source.CustomResult != null) {
            this.CustomResult = new CustomResult[source.CustomResult.length];
            for (int i = 0; i < source.CustomResult.length; i++) {
                this.CustomResult[i] = new CustomResult(source.CustomResult[i]);
            }
        }
        if (source.DetailResult != null) {
            this.DetailResult = new DetailResult[source.DetailResult.length];
            for (int i = 0; i < source.DetailResult.length; i++) {
                this.DetailResult[i] = new DetailResult(source.DetailResult[i]);
            }
        }
        if (source.ID != null) {
            this.ID = new TextOutputID(source.ID);
        }
        if (source.Res != null) {
            this.Res = new TextOutputRes(source.Res);
        }
        if (source.RiskDetails != null) {
            this.RiskDetails = new RiskDetails[source.RiskDetails.length];
            for (int i = 0; i < source.RiskDetails.length; i++) {
                this.RiskDetails[i] = new RiskDetails(source.RiskDetails[i]);
            }
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.EvilLabel != null) {
            this.EvilLabel = new String(source.EvilLabel);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilFlag", this.EvilFlag);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamObj(map, prefix + "Common.", this.Common);
        this.setParamArrayObj(map, prefix + "CustomResult.", this.CustomResult);
        this.setParamArrayObj(map, prefix + "DetailResult.", this.DetailResult);
        this.setParamObj(map, prefix + "ID.", this.ID);
        this.setParamObj(map, prefix + "Res.", this.Res);
        this.setParamArrayObj(map, prefix + "RiskDetails.", this.RiskDetails);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "EvilLabel", this.EvilLabel);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);

    }
}

