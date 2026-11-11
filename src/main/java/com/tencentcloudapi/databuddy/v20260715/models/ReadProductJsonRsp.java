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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadProductJsonRsp extends AbstractModel {

    /**
    * <p>文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>文件大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * <p>文件内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>请求状态码 0-成功，其他-异常</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
    * <p>返回结果提示信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path <p>文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path <p>文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>文件大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size <p>文件大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set <p>文件大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size <p>文件大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get <p>文件内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content <p>文件内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>文件内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content <p>文件内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>请求状态码 0-成功，其他-异常</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultCode <p>请求状态码 0-成功，其他-异常</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set <p>请求状态码 0-成功，其他-异常</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultCode <p>请求状态码 0-成功，其他-异常</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get <p>返回结果提示信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message <p>返回结果提示信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>返回结果提示信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message <p>返回结果提示信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ReadProductJsonRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadProductJsonRsp(ReadProductJsonRsp source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ResultCode != null) {
            this.ResultCode = new Long(source.ResultCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

