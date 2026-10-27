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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunCommandRequest extends AbstractModel {

    /**
    * <p>云桌面实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>执行的脚本内容，编码方式由ContentEncoding指定。<br>&lt;li&gt;脚本内容在Base64编码后的大小不能超过16 KB。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>脚本种类。取值有：&lt;li&gt;PowerShellScript Powershell脚本 &lt;li&gt;BatScript Bat脚本</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>是否同步等待脚本的执行结果。&lt;li&gt;false为异步模式，通过此接口触发任务的执行，之后异步获取执行结果。默认为false。此为推荐的模式。&lt;li&gt;true为同步等待执行结果，只有当脚本执行时间在4秒之内时，才适合将该参数置为true。如果接口返回时任务尚未执行完毕的话，也需要通过异步接口来获取执行结果。</p>
    */
    @SerializedName("WaitUntilDone")
    @Expose
    private Boolean WaitUntilDone;

    /**
    * <p>Content的编码。&lt;li&gt;Base64 Base64编码。 默认为Base64</p>
    */
    @SerializedName("ContentEncoding")
    @Expose
    private String ContentEncoding;

    /**
    * <p>任务的输出内容是否合并成一个字符串。&lt;li&gt;true表示所有的输出行拼接在一起。默认为true。&lt;li&gt;false表示输出内容通过数组返回,数组的每一个元素为一行。</p>
    */
    @SerializedName("MergeOutputLines")
    @Expose
    private Boolean MergeOutputLines;

    /**
    * <p>执行任务的用户ID。&lt;li&gt;由SYSTEM身份执行。此场景下不需要指定该字段，这是默认情况。&lt;li&gt;需要以绑定到实例的用户执行任务，通过该字段指定用户ID。 &lt;li&gt;匿名访问，需要以实际登录系统的用户执行的场景，该字段填实例ID。</p>
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * <p>任务是否为前台运行。仅在RunAs场景下有效。仅当任务会呼起图形界面时有意义。&lt;li&gt;true表示用户可以看到图形窗口。&lt;li&gt;false表示图形窗口不可见。默认为false。</p>
    */
    @SerializedName("RunForeground")
    @Expose
    private Boolean RunForeground;

    /**
     * Get <p>云桌面实例ID。</p> 
     * @return InstanceId <p>云桌面实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>云桌面实例ID。</p>
     * @param InstanceId <p>云桌面实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>执行的脚本内容，编码方式由ContentEncoding指定。<br>&lt;li&gt;脚本内容在Base64编码后的大小不能超过16 KB。</p> 
     * @return Content <p>执行的脚本内容，编码方式由ContentEncoding指定。<br>&lt;li&gt;脚本内容在Base64编码后的大小不能超过16 KB。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>执行的脚本内容，编码方式由ContentEncoding指定。<br>&lt;li&gt;脚本内容在Base64编码后的大小不能超过16 KB。</p>
     * @param Content <p>执行的脚本内容，编码方式由ContentEncoding指定。<br>&lt;li&gt;脚本内容在Base64编码后的大小不能超过16 KB。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>脚本种类。取值有：&lt;li&gt;PowerShellScript Powershell脚本 &lt;li&gt;BatScript Bat脚本</p> 
     * @return Type <p>脚本种类。取值有：&lt;li&gt;PowerShellScript Powershell脚本 &lt;li&gt;BatScript Bat脚本</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>脚本种类。取值有：&lt;li&gt;PowerShellScript Powershell脚本 &lt;li&gt;BatScript Bat脚本</p>
     * @param Type <p>脚本种类。取值有：&lt;li&gt;PowerShellScript Powershell脚本 &lt;li&gt;BatScript Bat脚本</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>是否同步等待脚本的执行结果。&lt;li&gt;false为异步模式，通过此接口触发任务的执行，之后异步获取执行结果。默认为false。此为推荐的模式。&lt;li&gt;true为同步等待执行结果，只有当脚本执行时间在4秒之内时，才适合将该参数置为true。如果接口返回时任务尚未执行完毕的话，也需要通过异步接口来获取执行结果。</p> 
     * @return WaitUntilDone <p>是否同步等待脚本的执行结果。&lt;li&gt;false为异步模式，通过此接口触发任务的执行，之后异步获取执行结果。默认为false。此为推荐的模式。&lt;li&gt;true为同步等待执行结果，只有当脚本执行时间在4秒之内时，才适合将该参数置为true。如果接口返回时任务尚未执行完毕的话，也需要通过异步接口来获取执行结果。</p>
     */
    public Boolean getWaitUntilDone() {
        return this.WaitUntilDone;
    }

    /**
     * Set <p>是否同步等待脚本的执行结果。&lt;li&gt;false为异步模式，通过此接口触发任务的执行，之后异步获取执行结果。默认为false。此为推荐的模式。&lt;li&gt;true为同步等待执行结果，只有当脚本执行时间在4秒之内时，才适合将该参数置为true。如果接口返回时任务尚未执行完毕的话，也需要通过异步接口来获取执行结果。</p>
     * @param WaitUntilDone <p>是否同步等待脚本的执行结果。&lt;li&gt;false为异步模式，通过此接口触发任务的执行，之后异步获取执行结果。默认为false。此为推荐的模式。&lt;li&gt;true为同步等待执行结果，只有当脚本执行时间在4秒之内时，才适合将该参数置为true。如果接口返回时任务尚未执行完毕的话，也需要通过异步接口来获取执行结果。</p>
     */
    public void setWaitUntilDone(Boolean WaitUntilDone) {
        this.WaitUntilDone = WaitUntilDone;
    }

    /**
     * Get <p>Content的编码。&lt;li&gt;Base64 Base64编码。 默认为Base64</p> 
     * @return ContentEncoding <p>Content的编码。&lt;li&gt;Base64 Base64编码。 默认为Base64</p>
     */
    public String getContentEncoding() {
        return this.ContentEncoding;
    }

    /**
     * Set <p>Content的编码。&lt;li&gt;Base64 Base64编码。 默认为Base64</p>
     * @param ContentEncoding <p>Content的编码。&lt;li&gt;Base64 Base64编码。 默认为Base64</p>
     */
    public void setContentEncoding(String ContentEncoding) {
        this.ContentEncoding = ContentEncoding;
    }

    /**
     * Get <p>任务的输出内容是否合并成一个字符串。&lt;li&gt;true表示所有的输出行拼接在一起。默认为true。&lt;li&gt;false表示输出内容通过数组返回,数组的每一个元素为一行。</p> 
     * @return MergeOutputLines <p>任务的输出内容是否合并成一个字符串。&lt;li&gt;true表示所有的输出行拼接在一起。默认为true。&lt;li&gt;false表示输出内容通过数组返回,数组的每一个元素为一行。</p>
     */
    public Boolean getMergeOutputLines() {
        return this.MergeOutputLines;
    }

    /**
     * Set <p>任务的输出内容是否合并成一个字符串。&lt;li&gt;true表示所有的输出行拼接在一起。默认为true。&lt;li&gt;false表示输出内容通过数组返回,数组的每一个元素为一行。</p>
     * @param MergeOutputLines <p>任务的输出内容是否合并成一个字符串。&lt;li&gt;true表示所有的输出行拼接在一起。默认为true。&lt;li&gt;false表示输出内容通过数组返回,数组的每一个元素为一行。</p>
     */
    public void setMergeOutputLines(Boolean MergeOutputLines) {
        this.MergeOutputLines = MergeOutputLines;
    }

    /**
     * Get <p>执行任务的用户ID。&lt;li&gt;由SYSTEM身份执行。此场景下不需要指定该字段，这是默认情况。&lt;li&gt;需要以绑定到实例的用户执行任务，通过该字段指定用户ID。 &lt;li&gt;匿名访问，需要以实际登录系统的用户执行的场景，该字段填实例ID。</p> 
     * @return RunAs <p>执行任务的用户ID。&lt;li&gt;由SYSTEM身份执行。此场景下不需要指定该字段，这是默认情况。&lt;li&gt;需要以绑定到实例的用户执行任务，通过该字段指定用户ID。 &lt;li&gt;匿名访问，需要以实际登录系统的用户执行的场景，该字段填实例ID。</p>
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set <p>执行任务的用户ID。&lt;li&gt;由SYSTEM身份执行。此场景下不需要指定该字段，这是默认情况。&lt;li&gt;需要以绑定到实例的用户执行任务，通过该字段指定用户ID。 &lt;li&gt;匿名访问，需要以实际登录系统的用户执行的场景，该字段填实例ID。</p>
     * @param RunAs <p>执行任务的用户ID。&lt;li&gt;由SYSTEM身份执行。此场景下不需要指定该字段，这是默认情况。&lt;li&gt;需要以绑定到实例的用户执行任务，通过该字段指定用户ID。 &lt;li&gt;匿名访问，需要以实际登录系统的用户执行的场景，该字段填实例ID。</p>
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get <p>任务是否为前台运行。仅在RunAs场景下有效。仅当任务会呼起图形界面时有意义。&lt;li&gt;true表示用户可以看到图形窗口。&lt;li&gt;false表示图形窗口不可见。默认为false。</p> 
     * @return RunForeground <p>任务是否为前台运行。仅在RunAs场景下有效。仅当任务会呼起图形界面时有意义。&lt;li&gt;true表示用户可以看到图形窗口。&lt;li&gt;false表示图形窗口不可见。默认为false。</p>
     */
    public Boolean getRunForeground() {
        return this.RunForeground;
    }

    /**
     * Set <p>任务是否为前台运行。仅在RunAs场景下有效。仅当任务会呼起图形界面时有意义。&lt;li&gt;true表示用户可以看到图形窗口。&lt;li&gt;false表示图形窗口不可见。默认为false。</p>
     * @param RunForeground <p>任务是否为前台运行。仅在RunAs场景下有效。仅当任务会呼起图形界面时有意义。&lt;li&gt;true表示用户可以看到图形窗口。&lt;li&gt;false表示图形窗口不可见。默认为false。</p>
     */
    public void setRunForeground(Boolean RunForeground) {
        this.RunForeground = RunForeground;
    }

    public RunCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunCommandRequest(RunCommandRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.WaitUntilDone != null) {
            this.WaitUntilDone = new Boolean(source.WaitUntilDone);
        }
        if (source.ContentEncoding != null) {
            this.ContentEncoding = new String(source.ContentEncoding);
        }
        if (source.MergeOutputLines != null) {
            this.MergeOutputLines = new Boolean(source.MergeOutputLines);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.RunForeground != null) {
            this.RunForeground = new Boolean(source.RunForeground);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "WaitUntilDone", this.WaitUntilDone);
        this.setParamSimple(map, prefix + "ContentEncoding", this.ContentEncoding);
        this.setParamSimple(map, prefix + "MergeOutputLines", this.MergeOutputLines);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "RunForeground", this.RunForeground);

    }
}

