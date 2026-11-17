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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FullBackupErrorMessage extends AbstractModel {

    /**
    * 错误标题。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 错误详情。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 错误标题。 
     * @return Title 错误标题。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 错误标题。
     * @param Title 错误标题。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 错误详情。 
     * @return Message 错误详情。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误详情。
     * @param Message 错误详情。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public FullBackupErrorMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FullBackupErrorMessage(FullBackupErrorMessage source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

