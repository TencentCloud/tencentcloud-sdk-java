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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskFaceResultOutput extends AbstractModel {

    /**
    * 智能人脸识别结果集。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 ResultSetFileUrl 对应的文件中获取。
    */
    @SerializedName("ResultSet")
    @Expose
    private AiRecognitionTaskFaceResultItem [] ResultSet;

    /**
    * 智能人脸识别结果集文件 URL。文件的内容为 JSON，数据结构与 ResultSet 字段一致。 （文件不会永久存储，到达ResultSetFileUrlExpireTime 时间点后文件将被删除）。
    */
    @SerializedName("ResultSetFileUrl")
    @Expose
    private String ResultSetFileUrl;

    /**
    * 智能人脸识别结果集文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("ResultSetFileUrlExpireTime")
    @Expose
    private String ResultSetFileUrlExpireTime;

    /**
     * Get 智能人脸识别结果集。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 ResultSetFileUrl 对应的文件中获取。 
     * @return ResultSet 智能人脸识别结果集。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 ResultSetFileUrl 对应的文件中获取。
     */
    public AiRecognitionTaskFaceResultItem [] getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set 智能人脸识别结果集。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 ResultSetFileUrl 对应的文件中获取。
     * @param ResultSet 智能人脸识别结果集。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 ResultSetFileUrl 对应的文件中获取。
     */
    public void setResultSet(AiRecognitionTaskFaceResultItem [] ResultSet) {
        this.ResultSet = ResultSet;
    }

    /**
     * Get 智能人脸识别结果集文件 URL。文件的内容为 JSON，数据结构与 ResultSet 字段一致。 （文件不会永久存储，到达ResultSetFileUrlExpireTime 时间点后文件将被删除）。 
     * @return ResultSetFileUrl 智能人脸识别结果集文件 URL。文件的内容为 JSON，数据结构与 ResultSet 字段一致。 （文件不会永久存储，到达ResultSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public String getResultSetFileUrl() {
        return this.ResultSetFileUrl;
    }

    /**
     * Set 智能人脸识别结果集文件 URL。文件的内容为 JSON，数据结构与 ResultSet 字段一致。 （文件不会永久存储，到达ResultSetFileUrlExpireTime 时间点后文件将被删除）。
     * @param ResultSetFileUrl 智能人脸识别结果集文件 URL。文件的内容为 JSON，数据结构与 ResultSet 字段一致。 （文件不会永久存储，到达ResultSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public void setResultSetFileUrl(String ResultSetFileUrl) {
        this.ResultSetFileUrl = ResultSetFileUrl;
    }

    /**
     * Get 智能人脸识别结果集文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return ResultSetFileUrlExpireTime 智能人脸识别结果集文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getResultSetFileUrlExpireTime() {
        return this.ResultSetFileUrlExpireTime;
    }

    /**
     * Set 智能人脸识别结果集文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param ResultSetFileUrlExpireTime 智能人脸识别结果集文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setResultSetFileUrlExpireTime(String ResultSetFileUrlExpireTime) {
        this.ResultSetFileUrlExpireTime = ResultSetFileUrlExpireTime;
    }

    public AiRecognitionTaskFaceResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskFaceResultOutput(AiRecognitionTaskFaceResultOutput source) {
        if (source.ResultSet != null) {
            this.ResultSet = new AiRecognitionTaskFaceResultItem[source.ResultSet.length];
            for (int i = 0; i < source.ResultSet.length; i++) {
                this.ResultSet[i] = new AiRecognitionTaskFaceResultItem(source.ResultSet[i]);
            }
        }
        if (source.ResultSetFileUrl != null) {
            this.ResultSetFileUrl = new String(source.ResultSetFileUrl);
        }
        if (source.ResultSetFileUrlExpireTime != null) {
            this.ResultSetFileUrlExpireTime = new String(source.ResultSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResultSet.", this.ResultSet);
        this.setParamSimple(map, prefix + "ResultSetFileUrl", this.ResultSetFileUrl);
        this.setParamSimple(map, prefix + "ResultSetFileUrlExpireTime", this.ResultSetFileUrlExpireTime);

    }
}

