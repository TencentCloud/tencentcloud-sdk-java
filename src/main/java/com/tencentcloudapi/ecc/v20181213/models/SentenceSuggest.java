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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentenceSuggest extends AbstractModel{

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 错误类型
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * 原始单词
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 替换成 的单词
    */
    @SerializedName("Replace")
    @Expose
    private String Replace;

    /**
    * 提示信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 维度单词位置，在句子的第几个到第几个单词之间
    */
    @SerializedName("ErrorPosition")
    @Expose
    private Long [] ErrorPosition;

    /**
    * 维度单词坐标，错误单词在图片中的坐标，只有传图片时正常返回，传文字时返回[ ]
    */
    @SerializedName("ErrorCoordinates")
    @Expose
    private ErrorCoordinate [] ErrorCoordinates;

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 错误类型 
     * @return ErrorType 错误类型
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set 错误类型
     * @param ErrorType 错误类型
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get 原始单词 
     * @return Origin 原始单词
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 原始单词
     * @param Origin 原始单词
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 替换成 的单词 
     * @return Replace 替换成 的单词
     */
    public String getReplace() {
        return this.Replace;
    }

    /**
     * Set 替换成 的单词
     * @param Replace 替换成 的单词
     */
    public void setReplace(String Replace) {
        this.Replace = Replace;
    }

    /**
     * Get 提示信息 
     * @return Message 提示信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 提示信息
     * @param Message 提示信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 维度单词位置，在句子的第几个到第几个单词之间 
     * @return ErrorPosition 维度单词位置，在句子的第几个到第几个单词之间
     */
    public Long [] getErrorPosition() {
        return this.ErrorPosition;
    }

    /**
     * Set 维度单词位置，在句子的第几个到第几个单词之间
     * @param ErrorPosition 维度单词位置，在句子的第几个到第几个单词之间
     */
    public void setErrorPosition(Long [] ErrorPosition) {
        this.ErrorPosition = ErrorPosition;
    }

    /**
     * Get 维度单词坐标，错误单词在图片中的坐标，只有传图片时正常返回，传文字时返回[ ] 
     * @return ErrorCoordinates 维度单词坐标，错误单词在图片中的坐标，只有传图片时正常返回，传文字时返回[ ]
     */
    public ErrorCoordinate [] getErrorCoordinates() {
        return this.ErrorCoordinates;
    }

    /**
     * Set 维度单词坐标，错误单词在图片中的坐标，只有传图片时正常返回，传文字时返回[ ]
     * @param ErrorCoordinates 维度单词坐标，错误单词在图片中的坐标，只有传图片时正常返回，传文字时返回[ ]
     */
    public void setErrorCoordinates(ErrorCoordinate [] ErrorCoordinates) {
        this.ErrorCoordinates = ErrorCoordinates;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ErrorType", this.ErrorType);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "Replace", this.Replace);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArraySimple(map, prefix + "ErrorPosition.", this.ErrorPosition);
        this.setParamArrayObj(map, prefix + "ErrorCoordinates.", this.ErrorCoordinates);

    }
}

