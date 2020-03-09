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

public class TextOutputRes extends AbstractModel{

    /**
    * 操作人,信安处理人企业微信ID
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 恶意操作码，
删除（1）， 通过（2）， 先审后发（100012）
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
    * 操作结果备注说明
    */
    @SerializedName("ResultMsg")
    @Expose
    private String ResultMsg;

    /**
    * 恶意类型，广告（10001）， 政治（20001）， 色情（20002）， 社会事件（20004）， 暴力（20011）， 低俗（20012）， 违法犯罪（20006）， 欺诈（20008）， 版权（20013）， 谣言（20104）， 其他（21000）
    */
    @SerializedName("ResultType")
    @Expose
    private Long ResultType;

    /**
     * Get 操作人,信安处理人企业微信ID 
     * @return Operator 操作人,信安处理人企业微信ID
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人,信安处理人企业微信ID
     * @param Operator 操作人,信安处理人企业微信ID
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 恶意操作码，
删除（1）， 通过（2）， 先审后发（100012） 
     * @return ResultCode 恶意操作码，
删除（1）， 通过（2）， 先审后发（100012）
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 恶意操作码，
删除（1）， 通过（2）， 先审后发（100012）
     * @param ResultCode 恶意操作码，
删除（1）， 通过（2）， 先审后发（100012）
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get 操作结果备注说明 
     * @return ResultMsg 操作结果备注说明
     */
    public String getResultMsg() {
        return this.ResultMsg;
    }

    /**
     * Set 操作结果备注说明
     * @param ResultMsg 操作结果备注说明
     */
    public void setResultMsg(String ResultMsg) {
        this.ResultMsg = ResultMsg;
    }

    /**
     * Get 恶意类型，广告（10001）， 政治（20001）， 色情（20002）， 社会事件（20004）， 暴力（20011）， 低俗（20012）， 违法犯罪（20006）， 欺诈（20008）， 版权（20013）， 谣言（20104）， 其他（21000） 
     * @return ResultType 恶意类型，广告（10001）， 政治（20001）， 色情（20002）， 社会事件（20004）， 暴力（20011）， 低俗（20012）， 违法犯罪（20006）， 欺诈（20008）， 版权（20013）， 谣言（20104）， 其他（21000）
     */
    public Long getResultType() {
        return this.ResultType;
    }

    /**
     * Set 恶意类型，广告（10001）， 政治（20001）， 色情（20002）， 社会事件（20004）， 暴力（20011）， 低俗（20012）， 违法犯罪（20006）， 欺诈（20008）， 版权（20013）， 谣言（20104）， 其他（21000）
     * @param ResultType 恶意类型，广告（10001）， 政治（20001）， 色情（20002）， 社会事件（20004）， 暴力（20011）， 低俗（20012）， 违法犯罪（20006）， 欺诈（20008）， 版权（20013）， 谣言（20104）， 其他（21000）
     */
    public void setResultType(Long ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "ResultMsg", this.ResultMsg);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);

    }
}

