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
    * 命中的关键词
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilFlag", this.EvilFlag);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamObj(map, prefix + "Common.", this.Common);
        this.setParamObj(map, prefix + "ID.", this.ID);
        this.setParamObj(map, prefix + "Res.", this.Res);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);

    }
}

