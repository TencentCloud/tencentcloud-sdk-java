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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Attachment extends AbstractModel{

    /**
    * 附件名称，最大支持255个字符长度，不支持部分附件类型，详情请参考[附件类型](https://cloud.tencent.com/document/product/1288/51951)。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Base64之后的附件内容，你可以发送的附件大小上限为4M。注意：腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍。应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 接口会返回错误。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 附件名称，最大支持255个字符长度，不支持部分附件类型，详情请参考[附件类型](https://cloud.tencent.com/document/product/1288/51951)。 
     * @return FileName 附件名称，最大支持255个字符长度，不支持部分附件类型，详情请参考[附件类型](https://cloud.tencent.com/document/product/1288/51951)。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 附件名称，最大支持255个字符长度，不支持部分附件类型，详情请参考[附件类型](https://cloud.tencent.com/document/product/1288/51951)。
     * @param FileName 附件名称，最大支持255个字符长度，不支持部分附件类型，详情请参考[附件类型](https://cloud.tencent.com/document/product/1288/51951)。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Base64之后的附件内容，你可以发送的附件大小上限为4M。注意：腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍。应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 接口会返回错误。 
     * @return Content Base64之后的附件内容，你可以发送的附件大小上限为4M。注意：腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍。应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 接口会返回错误。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64之后的附件内容，你可以发送的附件大小上限为4M。注意：腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍。应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 接口会返回错误。
     * @param Content Base64之后的附件内容，你可以发送的附件大小上限为4M。注意：腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍。应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 接口会返回错误。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public Attachment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Attachment(Attachment source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

