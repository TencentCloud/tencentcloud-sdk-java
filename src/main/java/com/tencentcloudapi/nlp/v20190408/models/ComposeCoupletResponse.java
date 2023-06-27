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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeCoupletResponse extends AbstractModel{

    /**
    * 横批。
    */
    @SerializedName("TopScroll")
    @Expose
    private String TopScroll;

    /**
    * 上联与下联。
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
    * 当对联随机生成时，展示随机生成原因。
    */
    @SerializedName("RandomCause")
    @Expose
    private String RandomCause;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 横批。 
     * @return TopScroll 横批。
     */
    public String getTopScroll() {
        return this.TopScroll;
    }

    /**
     * Set 横批。
     * @param TopScroll 横批。
     */
    public void setTopScroll(String TopScroll) {
        this.TopScroll = TopScroll;
    }

    /**
     * Get 上联与下联。 
     * @return Content 上联与下联。
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set 上联与下联。
     * @param Content 上联与下联。
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    /**
     * Get 当对联随机生成时，展示随机生成原因。 
     * @return RandomCause 当对联随机生成时，展示随机生成原因。
     */
    public String getRandomCause() {
        return this.RandomCause;
    }

    /**
     * Set 当对联随机生成时，展示随机生成原因。
     * @param RandomCause 当对联随机生成时，展示随机生成原因。
     */
    public void setRandomCause(String RandomCause) {
        this.RandomCause = RandomCause;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ComposeCoupletResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeCoupletResponse(ComposeCoupletResponse source) {
        if (source.TopScroll != null) {
            this.TopScroll = new String(source.TopScroll);
        }
        if (source.Content != null) {
            this.Content = new String[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new String(source.Content[i]);
            }
        }
        if (source.RandomCause != null) {
            this.RandomCause = new String(source.RandomCause);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopScroll", this.TopScroll);
        this.setParamArraySimple(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "RandomCause", this.RandomCause);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

