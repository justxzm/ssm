package guava_cache;

import cn.justxzm.model.userManagement.Admin;
import cn.justxzm.web.admin.AdminController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import java.util.List;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by XZM on 2017/4/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath*:/spring.xml"})
public class guava_test {
    /*************************guava cache单元测试********************************/
    /*************************不启动服务器本地缓存无效******************************/
    @Autowired
    private AdminController adminController;

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }
    @Test
    public void findAdminByUserName_Test() throws Exception {

        /*mockMvc.perform((post("/admin/findAdminByUsername").param("username", "admin"))).andExpect(status().isOk())
                .andDo(print());*/
        List<Admin> adminList=adminController.findAdminByUserName("admin");
        for(Admin admin:adminList){
            System.out.println(admin.getId()+","+admin.getUsername()+","+admin.getPassword());
        }
        List<Admin> adminList2=adminController.findAdminByUserName("admin");
        System.out.println(adminList==adminList2);
    }
    @Test
    public void findAdminList_Test() throws Exception {
        List<Admin> adminList=adminController.findAdminList("admin","123456",0,2);
        for(Admin admin:adminList){
            System.out.println(admin.getId()+","+admin.getUsername()+","+admin.getPassword());
        }
        List<Admin> adminList2=adminController.findAdminList("admin","123456",0,2);
        System.out.println(adminList==adminList2);
    }
}
